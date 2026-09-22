# PROJECT_HANDOFF.md

## Current state

Active upstream contribution work is issue #828 in `Writeopia/Writeopia`. The canonical detailed current state is maintained in `Glutoide-lab/project-memory/WRITEOPIA_HANDOFF_CURRENT.md`.

## Verified constraints

- This fork feeds upstream pull requests; upstream merge/close decisions belong to Writeopia maintainers.
- Preserve the existing stacked PR order for #828.
- Follow the local Testing Contract in `AGENTS.md`.
- Do not restart completed architecture/audit work unless a concrete regression requires it.

## Do not change now

- Do not force-push the active stacked branches just to make history linear.
- Do not add or replace CI workflows for #828.
- Do not redesign comment anchoring, auth, release, or production migration architecture as part of the current work.

## Next step

Read and execute the current `Next step` in `Glutoide-lab/project-memory/WRITEOPIA_HANDOFF_CURRENT.md`.

## Global plan

Complete the active #828 stacked PR sequence, validate each required gate, then hand the clean stack back to upstream maintainers for their merge decisions.
