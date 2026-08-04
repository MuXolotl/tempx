package defpackage;

import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;

/* JADX INFO: renamed from: lًٔۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15158l implements InterfaceC0930l {
    public C9426l amazon;
    public volatile int crashlytics = 2;
    public InterfaceC16983l loadAd;
    public final C15161l yandex;

    public C15158l(C15736l c15736l, C15161l c15161l, C14338l c14338l, C8715l c8715l, InterfaceC16230l interfaceC16230l) {
        this.yandex = c15161l;
        AbstractC15929l.yandex(Unit.INSTANCE);
    }

    public final C9426l crashlytics(int i, boolean z) {
        if (AbstractC5088l.firebase("CXCP")) {
            StringBuilder sbSignature = AbstractC2812l.Signature("setFlashAsync: flashMode = ", i, ", requestControl = ");
            sbSignature.append(this.loadAd);
            Log.d("CXCP", sbSignature.toString());
        }
        C9426l c9426l = new C9426l();
        if (this.loadAd == null) {
            AbstractC14814l.isVip("Camera is not active.", c9426l);
            return c9426l;
        }
        this.crashlytics = i;
        C9426l c9426l2 = this.amazon;
        if (z) {
            if (c9426l2 != null) {
                AbstractC14814l.isVip("There is a new flash mode being set or camera was closed", c9426l2);
            }
            this.amazon = null;
        } else if (c9426l2 != null) {
            AbstractC0140l.vip(c9426l, c9426l2);
        }
        this.amazon = c9426l;
        C15161l c15161l = this.yandex;
        synchronized (c15161l.amazon) {
            c15161l.admob = i;
            Unit unit = Unit.INSTANCE;
        }
        AbstractC0140l.vip(c15161l.billing(), c9426l);
        return c9426l;
    }

    @Override // defpackage.InterfaceC0930l
    public final void loadAd(InterfaceC16983l interfaceC16983l) {
        this.loadAd = interfaceC16983l;
        crashlytics(this.crashlytics, false);
    }

    @Override // defpackage.InterfaceC0930l
    public final void reset() {
        this.crashlytics = 2;
        C9426l c9426l = this.amazon;
        if (c9426l != null) {
            AbstractC14814l.isVip("There is a new flash mode being set or camera was closed", c9426l);
        }
        this.amazon = null;
        crashlytics(2, true);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object yandex(AbstractC0283l abstractC0283l) {
        C12297l c12297l;
        int i;
        if (abstractC0283l instanceof C12297l) {
            c12297l = (C12297l) abstractC0283l;
            int i2 = c12297l.f24369l;
            if ((i2 & RecyclerView.UNDEFINED_DURATION) != 0) {
                c12297l.f24369l = i2 - RecyclerView.UNDEFINED_DURATION;
            } else {
                c12297l = new C12297l(this, abstractC0283l);
            }
        } else {
            c12297l = new C12297l(this, abstractC0283l);
        }
        Object obj = c12297l.f24370l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        int i3 = c12297l.f24369l;
        if (i3 == 0) {
            AbstractC2829l.crashlytics(obj);
            if (AbstractC5088l.firebase("CXCP")) {
                Log.d("CXCP", "FlashControl: Waiting for any ongoing update to be completed");
            }
            int i4 = this.crashlytics;
            C9426l c9426lYandex = this.amazon;
            if (c9426lYandex == null) {
                c9426lYandex = AbstractC15929l.yandex(Unit.INSTANCE);
            }
            c12297l.f24371l = i4;
            c12297l.f24369l = 1;
            if (c9426lYandex.mo2158switch(c12297l) == enumC9342l) {
                return enumC9342l;
            }
            i = i4;
        } else {
            if (i3 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = c12297l.f24371l;
            AbstractC2829l.crashlytics(obj);
        }
        if (AbstractC5088l.firebase("CXCP")) {
            Log.d("CXCP", "awaitFlashModeUpdate: initialFlashMode = " + i);
        }
        return new Integer(i);
    }
}
