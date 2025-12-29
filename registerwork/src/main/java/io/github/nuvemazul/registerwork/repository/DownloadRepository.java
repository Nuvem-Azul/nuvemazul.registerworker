package io.github.nuvemazul.registerwork.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.nuvemazul.registerwork.entity.Download;

public interface DownloadRepository extends JpaRepository<Download, Long> {

}
