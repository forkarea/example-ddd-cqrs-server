package example.scrumboard.domain.backlog.task;

public class InProgressTaskState extends TaskStateAdapter {

	@Override
	public boolean isInProgress() {
		return true;
	}

	@Override
	public void finish(Task task) {
		task.doFinish();
	}

}