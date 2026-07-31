package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: lؖۚۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4387l implements InterfaceC14142l {
    public final Object crashlytics;
    public final C15106l loadAd;
    public final /* synthetic */ int yandex;

    public /* synthetic */ C4387l(Object obj, C15106l c15106l, int i) {
        this.yandex = i;
        this.crashlytics = obj;
        this.loadAd = c15106l;
    }

    @Override // defpackage.InterfaceC14142l
    public final Object yandex(C6563l c6563l) {
        int i = this.yandex;
        Object obj = this.crashlytics;
        C15106l c15106l = this.loadAd;
        switch (i) {
            case 0:
                C0869l c0869l = new C0869l();
                c0869l.m738write((byte[]) obj);
                return new C6669l(AbstractC17291l.loadAd(c0869l, c15106l.billing), null, 2);
            case 1:
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                return new C6669l(new C7035l(new C1503l(new C4859l(byteBuffer)), c15106l.billing, new C10616l(byteBuffer)), null, 2);
            default:
                Drawable bitmapDrawable = (Drawable) obj;
                Bitmap.Config[] configArr = AbstractC4032l.yandex;
                boolean z = (bitmapDrawable instanceof VectorDrawable) || (bitmapDrawable instanceof C5669l);
                if (z) {
                    bitmapDrawable = new BitmapDrawable(c15106l.yandex.getResources(), AbstractC4072l.license(bitmapDrawable, AbstractC10413l.loadAd(c15106l), c15106l.loadAd, c15106l.crashlytics, (C9192l) AbstractC0532l.amazon(c15106l, AbstractC12872l.loadAd), c15106l.amazon == 2));
                }
                return new C9245l(AbstractC3230l.crashlytics(bitmapDrawable), z, 2);
        }
    }
}
