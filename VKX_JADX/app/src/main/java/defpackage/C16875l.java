package defpackage;

import android.webkit.WebView;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: lٗؔٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16875l {
    public final C10086l crashlytics;
    public final C10086l loadAd;
    public final C8490l yandex = AbstractC3861l.loadAd(0, 0, 6);

    public C16875l() {
        Boolean bool = Boolean.FALSE;
        this.loadAd = AbstractC8020l.smaato(bool);
        this.crashlytics = AbstractC8020l.smaato(bool);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final void yandex(WebView webView, AbstractC0283l abstractC0283l) {
        C4925l c4925l;
        if (abstractC0283l instanceof C4925l) {
            c4925l = (C4925l) abstractC0283l;
            int i = c4925l.f10035l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c4925l.f10035l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c4925l = new C4925l(this, abstractC0283l);
            }
        } else {
            c4925l = new C4925l(this, abstractC0283l);
        }
        Object obj = c4925l.f10034l;
        int i2 = c4925l.f10035l;
        int i3 = 1;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj);
            C16552l c16552l = AbstractC11463l.yandex;
            C2975l c2975l = AbstractC17278l.yandex;
            C13026l c13026l = new C13026l(this, webView, null, i3);
            c4925l.f10035l = 1;
            if (AbstractC10999l.firebase(c2975l, c13026l, c4925l) == EnumC9342l.f19165l) {
                return;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return;
            }
            AbstractC2829l.crashlytics(obj);
        }
        C17132l.firebase();
    }
}
