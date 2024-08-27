# minecraft @ home view offset mod

Made for the Minecraft@Home pack.png seedcracking project. Made for game version 1.16.5.

In older versions, the view was translated backwards by -0.1 blocks for some inexplicable reason. This affects the vertical position of the camera slightly when looking above or below the horizon. We needed this to accurately recreate screenshots in newer versions (which have more client mod and server plugin support for other things, such as WorldEdit and creative mode) for seed cracking.

It's just a simple mixin that replaces some functions. But when you're matching down to a pixel level, it totally matters.

It also brings back the old crouch height of 1.54, replacing the new crouch height, which is lower (though I can't recall the exact value right now). It was suspected at the time that Notch was crouching while taking the pack.png shot, but I think it turned out that he was floating in the water.
