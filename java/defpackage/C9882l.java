package defpackage;

import android.graphics.ImageDecoder;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: lٍۡۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9882l implements InterfaceC3773l {
    public final C16628l amazon;
    public final C15106l crashlytics;
    public final AutoCloseable loadAd;
    public final ImageDecoder.Source yandex;

    public C9882l(ImageDecoder.Source source, AutoCloseable autoCloseable, C15106l c15106l, C16628l c16628l) {
        this.yandex = source;
        this.loadAd = autoCloseable;
        this.crashlytics = c15106l;
        this.amazon = c16628l;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.InterfaceC3773l
    public final Object yandex(InterfaceC14029l interfaceC14029l) {
        C5778l c5778l;
        C16628l c16628l;
        if (interfaceC14029l instanceof C5778l) {
            c5778l = (C5778l) interfaceC14029l;
            int i = c5778l.f12189l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c5778l.f12189l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c5778l = new C5778l(this, (AbstractC0283l) interfaceC14029l);
            }
        } else {
            c5778l = new C5778l(this, (AbstractC0283l) interfaceC14029l);
        }
        Object obj = c5778l.f12190l;
        int i2 = c5778l.f12189l;
        int i3 = 1;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj);
            C16628l c16628l2 = this.amazon;
            c5778l.f12191l = c16628l2;
            c5778l.f12189l = 1;
            Object objLoadAd = c16628l2.loadAd(c5778l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objLoadAd == enumC9342l) {
                return enumC9342l;
            }
            c16628l = c16628l2;
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c16628l = c5778l.f12191l;
            AbstractC2829l.crashlytics(obj);
        }
        try {
            AutoCloseable autoCloseable = this.loadAd;
            try {
                C9122l c9122l = new C9122l();
                C9969l c9969l = new C9969l(new C13028l(ImageDecoder.decodeBitmap(this.yandex, new C3463l(this, c9122l, i3))), c9122l.f18750l);
                AbstractC1214l.yandex(autoCloseable, null);
                c16628l.amazon();
                return c9969l;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AbstractC1214l.yandex(autoCloseable, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            c16628l.amazon();
            throw th3;
        }
    }
}
