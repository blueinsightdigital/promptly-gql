package digital.blueinsight.promptly

import java.util.concurrent.Executors

import scala.concurrent.ExecutionContext
import scala.concurrent.duration._

import cats.effect.{ExitCode, IO, IOApp, Resource}
import cats.syntax.all._
import digital.blueinsight.promptly.starwars.{StarWarsData, StarWarsMapping}

// #main
object Main extends IOApp {
  def run(args: List[String]): IO[ExitCode] = {
    val starWarsGraphQLRoutes = GraphQLService.routes[IO](
      "starwars",
      GraphQLService.fromMapping(
        new StarWarsMapping[IO] with StarWarsData[IO]
      )
    )
    DemoServer.resource(starWarsGraphQLRoutes).useForever.as(ExitCode.Success)
  }
}
