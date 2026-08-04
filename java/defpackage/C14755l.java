package defpackage;

import android.media.VolumeProvider;
import android.os.Handler;

/* JADX INFO: renamed from: lًؙٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14755l extends VolumeProvider {
    public final /* synthetic */ Object loadAd;
    public final /* synthetic */ int yandex;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14755l(Object obj, int i, int i2, int i3, String str, int i4) {
        super(i, i2, i3, str);
        this.yandex = i4;
        this.loadAd = obj;
    }

    @Override // android.media.VolumeProvider
    public final void onAdjustVolume(int i) {
        int i2 = this.yandex;
        int i3 = 1;
        Object obj = this.loadAd;
        switch (i2) {
            case 0:
                C6649l c6649l = (C6649l) obj;
                AbstractC15323l.m3966final((Handler) c6649l.f13975l, new RunnableC17803l((C18602l) c6649l.f13970l, i, i3));
                break;
            default:
                C2934l c2934l = (C2934l) obj;
                ((C17646l) ((C0554l) c2934l.f6385l).f1956l).yandex.post(new RunnableC15124l(c2934l, i, i3));
                break;
        }
    }

    @Override // android.media.VolumeProvider
    public final void onSetVolumeTo(int i) {
        int i2 = this.yandex;
        int i3 = 0;
        Object obj = this.loadAd;
        switch (i2) {
            case 0:
                C6649l c6649l = (C6649l) obj;
                AbstractC15323l.m3966final((Handler) c6649l.f13975l, new RunnableC17803l((C18602l) c6649l.f13970l, i, i3));
                break;
            default:
                C2934l c2934l = (C2934l) obj;
                ((C17646l) ((C0554l) c2934l.f6385l).f1956l).yandex.post(new RunnableC15124l(c2934l, i, i3));
                break;
        }
    }
}
