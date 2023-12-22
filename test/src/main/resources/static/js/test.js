function changeAudioSource(newSource, newTitle) {
	// 오디오 엘리먼트를 가져옵니다.
	var audioElement = document.querySelector('audio');

	// 오디오의 소스를 동적으로 변경합니다.
	audioElement.src = newSource;

	// 변경된 소스를 로드하도록 명시합니다.
	audioElement.load();

	// (선택 사항) 변경된 소스를 재생합니다.
	// audioElement.play();

	var titleElement = document.getElementById('audio-title');
	titleElement.textContent = newTitle;
}

function expandFooter() {
	const footer = document.querySelector('footer');
	const currentHeight = footer.clientHeight;
	const newHeight = currentHeight === 50 ? 150 : 50; // 푸터의 현재 높이와 변경될 높이 지정

	footer.style.height = `${newHeight}px`;
}
