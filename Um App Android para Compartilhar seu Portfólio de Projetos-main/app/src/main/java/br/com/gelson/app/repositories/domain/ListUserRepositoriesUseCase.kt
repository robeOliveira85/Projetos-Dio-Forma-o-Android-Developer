package br.com.gelson.app.repositories.domain

import br.com.gelson.app.repositories.core.UseCase
import br.com.gelson.app.repositories.data.model.Repo
import br.com.gelson.app.repositories.data.repositories.RepoRepository
import kotlinx.coroutines.flow.Flow

class ListUserRepositoriesUseCase(
    private val repository: RepoRepository
) : UseCase<String, List<Repo>>() {

    override suspend fun execute(param: String): Flow<List<Repo>> {
        return repository.listRepositories(param)
    }
}