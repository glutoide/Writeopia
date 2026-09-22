# AGENTS.md

This repository follows the shared rules in `Glutoide-lab/project-memory/AGENTS.md`.

## Project constraints

- This repository is a fork of `Writeopia/Writeopia` used for upstream contributions.
- Do not merge, close, or rewrite upstream pull requests on behalf of maintainers.
- Do not force-push stacked contribution branches merely to linearize history.
- Keep changes scoped to the active upstream issue/PR; do not change CI/CD, release, auth, or unrelated architecture without a concrete blocker.
- For issue #828, preserve the established stack order: `#830 -> #831 -> #832 -> #835 -> #836`.
- The canonical live handoff for the current Writeopia contribution work is `Glutoide-lab/project-memory/WRITEOPIA_HANDOFF_CURRENT.md`.

## Testing Contract

- Use the repository's existing `Build and test` workflow as the ordinary PR gate; do not add a new workflow for this project.
- For comment/editor/persistence/backend changes, require the existing workflow to complete successfully, including backend build/tests, general debug build, ktlint, JVM UI Compose tests, web build, iOS build, Mac app build, and documentation build when GitHub schedules them.
- Backend persistence or sync behavior changes require focused automated tests in the existing test suites.
- Before handing a substantive PR back to upstream maintainers, require green ordinary CI, one final CodeRabbit gate according to shared rule 8a, no confirmed outstanding Critical/Major findings, and zero unresolved actionable review threads.
- No physical-device test is required for the current #828 backend/comment stack unless a concrete device-only regression appears.
- Production schema rollout is outside this repository when no in-repo production migration runner exists; do not invent a migration framework merely to satisfy a PR gate.
