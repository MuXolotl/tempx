package defpackage;

import android.content.Context;
import android.graphics.Bitmap;

/* JADX INFO: renamed from: lِٟؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C12023l implements InterfaceC17302l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f23957l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f23958l;

    public /* synthetic */ C12023l(int i, Object obj) {
        this.f23958l = i;
        this.f23957l = obj;
    }

    @Override // defpackage.InterfaceC17302l
    public final Object apply(Object obj) {
        int i = this.f23958l;
        Object obj2 = this.f23957l;
        switch (i) {
            case 0:
                Context context = ((C17804l) obj2).f34713l;
                String str = AbstractC15323l.yandex;
                int iGenerateAudioSessionId = AbstractC13950l.vip(context).generateAudioSessionId();
                if (iGenerateAudioSessionId == -1) {
                    iGenerateAudioSessionId = 0;
                }
                return Integer.valueOf(iGenerateAudioSessionId);
            case 1:
                AbstractServiceC3639l.crashlytics((AbstractServiceC3639l) obj2, (RuntimeException) obj);
                return null;
            case 2:
                Bitmap bitmap = (Bitmap) obj;
                int height = bitmap.getHeight();
                int width = bitmap.getWidth();
                C13967l c13967l = (C13967l) ((C2494l) obj2).f5290l;
                if (!c13967l.yandex(Math.max(height, width))) {
                    return bitmap;
                }
                if (c13967l.yandex(height)) {
                    height--;
                }
                if (c13967l.yandex(width)) {
                    width--;
                }
                return AbstractC12148l.pro(Bitmap.createScaledBitmap(bitmap, width, height, true));
            case 3:
                Bitmap bitmapCreateScaledBitmap = (Bitmap) obj;
                int width2 = bitmapCreateScaledBitmap.getWidth();
                int i2 = ((C14785l) obj2).f28908l;
                if (width2 > i2 || bitmapCreateScaledBitmap.getHeight() > i2) {
                    float f = i2;
                    float width3 = bitmapCreateScaledBitmap.getWidth();
                    float height2 = bitmapCreateScaledBitmap.getHeight();
                    float fMin = Math.min(f / width3, f / height2);
                    bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCreateScaledBitmap, (int) (width3 * fMin), (int) (height2 * fMin), true);
                }
                return AbstractC12148l.pro(bitmapCreateScaledBitmap);
            default:
                C1080l c1080l = (C1080l) obj2;
                C12551l c12551l = (C12551l) obj;
                C13773l c13773l = (C13773l) c1080l.f2971l;
                if (c13773l != null) {
                    try {
                        ((Context) c1080l.f2970l).unregisterReceiver(c13773l);
                    } catch (RuntimeException e) {
                        AbstractC6427l.metrica("StreamVolumeManager", "Error unregistering stream volume receiver", e);
                    }
                    c1080l.f2971l = null;
                    break;
                }
                return c12551l;
        }
    }
}
