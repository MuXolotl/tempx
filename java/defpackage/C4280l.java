package defpackage;

import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import java.util.LinkedList;

/* JADX INFO: renamed from: lؖٞٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4280l implements InterfaceC0930l {
    public InterfaceC16983l amazon;
    public final C14338l loadAd;
    public final C15158l yandex;
    public final C4910l crashlytics = AbstractC8618l.yandex();
    public final LinkedList purchase = new LinkedList();

    public C4280l(C15158l c15158l, C14338l c14338l) {
        this.yandex = c15158l;
        this.loadAd = c14338l;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object yandex(C4280l c4280l, AbstractC14950l abstractC14950l, InterfaceC16983l interfaceC16983l, AbstractC0283l abstractC0283l) {
        C14622l c14622l;
        c4280l.getClass();
        if (abstractC0283l instanceof C14622l) {
            c14622l = (C14622l) abstractC0283l;
            int i = c14622l.f28617l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c14622l.f28617l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c14622l = new C14622l(c4280l, abstractC0283l);
            }
        } else {
            c14622l = new C14622l(c4280l, abstractC0283l);
        }
        Object objYandex = c14622l.f28616l;
        int i2 = c14622l.f28617l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objYandex);
            if (AbstractC5088l.firebase("CXCP")) {
                Log.d("CXCP", "StillCaptureRequestControl: submitting " + abstractC14950l + " at " + interfaceC16983l);
            }
            C15158l c15158l = c4280l.yandex;
            c14622l.f28617l = 1;
            objYandex = c15158l.yandex(c14622l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objYandex == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC2829l.crashlytics(objYandex);
        }
        ((Number) objYandex).intValue();
        if (!AbstractC5088l.firebase("CXCP")) {
            throw null;
        }
        Log.d("CXCP", "StillCaptureRequestControl: Issuing single capture");
        throw null;
    }

    @Override // defpackage.InterfaceC0930l
    public final void loadAd(InterfaceC16983l interfaceC16983l) {
        this.amazon = interfaceC16983l;
        AbstractC10999l.mopub(this.loadAd.purchase, null, 0, new C1914l(this, null), 3);
    }

    @Override // defpackage.InterfaceC0930l
    public final void reset() {
        AbstractC10999l.mopub(this.loadAd.purchase, null, 0, new C0932l(this, null, 0), 3);
    }
}
