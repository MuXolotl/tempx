package ua.itaysonlab.vkapi2.objects.music.playlist;

import defpackage.InterfaceC15749l;
import defpackage.InterfaceC9347l;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001BC\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0003\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lua/itaysonlab/vkapi2/objects/music/playlist/AudioPlaylistPermissions;", "", "", "canClone", "canFollow", "canDelete", "canEdit", "canShare", "canPlay", "<init>", "(ZZZZZZ)V", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
@InterfaceC15749l(generateAdapter = true)
public final class AudioPlaylistPermissions {
    public final boolean amazon;
    public final boolean billing;
    public final boolean crashlytics;
    public final boolean loadAd;
    public final boolean purchase;
    public final boolean yandex;

    public AudioPlaylistPermissions(@InterfaceC9347l(name = "save_as_copy") boolean z, @InterfaceC9347l(name = "follow") boolean z2, @InterfaceC9347l(name = "delete") boolean z3, @InterfaceC9347l(name = "edit") boolean z4, @InterfaceC9347l(name = "share") boolean z5, @InterfaceC9347l(name = "play") boolean z6) {
        this.yandex = z;
        this.loadAd = z2;
        this.crashlytics = z3;
        this.amazon = z4;
        this.purchase = z5;
        this.billing = z6;
    }
}
