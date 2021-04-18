var gulp = require('gulp');
var browserify = require('browserify'),
 babelify = require('babelify'),
 source = require('vinyl-source-stream');
gulp.task('default', function () {
 return browserify('./src/index.js')
 .transform(babelify)
 .bundle()
 .pipe(source('index.js'))
 .pipe(gulp.dest('./build/'));
});
