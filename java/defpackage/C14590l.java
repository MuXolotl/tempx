package defpackage;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: lٔؐؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C14590l implements InterfaceC13241l {
    public final /* synthetic */ Object amazon;
    public final /* synthetic */ Object crashlytics;
    public final /* synthetic */ Object loadAd;
    public final /* synthetic */ int yandex;

    public /* synthetic */ C14590l(Object obj, Object obj2, Object obj3, int i) {
        this.yandex = i;
        this.loadAd = obj;
        this.crashlytics = obj2;
        this.amazon = obj3;
    }

    @Override // defpackage.InterfaceC13241l
    public final void accept(Object obj) {
        int i = this.yandex;
        Object obj2 = this.amazon;
        Object obj3 = this.crashlytics;
        Object obj4 = this.loadAd;
        switch (i) {
            case 0:
                C0284l c0284l = (C0284l) obj4;
                SurfaceTexture surfaceTexture = (SurfaceTexture) obj3;
                surfaceTexture.setOnFrameAvailableListener(null);
                surfaceTexture.release();
                ((Surface) obj2).release();
                c0284l.f1302l--;
                c0284l.crashlytics();
                break;
            default:
                View view = (View) obj3;
                float[] fArr = (float[]) obj2;
                Bitmap bitmap = (Bitmap) obj;
                C10295l c10295l = new C10295l((Activity) obj4);
                ViewGroup viewGroup = (ViewGroup) view;
                if (bitmap != null && bitmap.getWidth() > 0 && bitmap.getHeight() > 0) {
                    c10295l.setImageBitmap(bitmap);
                    viewGroup.addView(c10295l);
                }
                AbstractC12930l.loadAd(view);
                if (bitmap != null && bitmap.getWidth() > 0 && bitmap.getHeight() > 0) {
                    AbstractC13209l.loadAd.yandex(c10295l, fArr, new RunnableC12388l(viewGroup, c10295l, 0));
                    break;
                }
                break;
        }
    }
}
