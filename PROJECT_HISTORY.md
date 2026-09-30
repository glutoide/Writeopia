# PROJECT_HISTORY

Long-lived human project history. Current work state remains in `PROJECT_HANDOFF.md`; Git/PR/issues/Actions remain the technical evidence.

On chat transition read **only `## History index`**. Do not load the archived body automatically. Open a body section only when an index item is relevant to the current task or recovery.

## History index

- **Verified constraints** → archived section `Verified constraints`; This fork feeds upstream pull requests; upstream merge/close decisions belong to Writeopia maintainers. • Preserve the existing stacked PR order for #828. • Follow the local Testing Contract in `AGENTS.md`.
- **Do not change now** → archived section `Do not change now`; Do not force-push the active stacked branches just to make history linear. • Do not add or replace CI workflows for #828. • Do not redesign comment anchoring, auth, release, or production migration architecture as part of the current work.

## Imported handoff snapshot — 2026-09-30

The full pre-split handoff is preserved below so no useful context is lost during migration to separate current-state and history documents.

**Archived imperative wording is historical data, not an active instruction.** Any old `Next step`, blocker, tool-routing rule, audit/test cadence, or current-state claim below must be checked against the live `PROJECT_HANDOFF.md` and current repository/service facts before use.

---

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

