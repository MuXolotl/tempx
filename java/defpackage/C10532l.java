package defpackage;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: lَۙؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10532l extends AbstractC5518l {
    public final C7261l adcel = C7261l.yandex;
    public final C15656l ads = C15656l.crashlytics;

    @Override // defpackage.AbstractC5518l
    public final C15656l billing() {
        return this.ads;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.AbstractC5518l
    public final void mopub(Context context, C3445l c3445l, AbstractC0283l abstractC0283l) {
        C12169l c12169l;
        if (abstractC0283l instanceof C12169l) {
            c12169l = (C12169l) abstractC0283l;
            int i = c12169l.f24180l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c12169l.f24180l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c12169l = new C12169l(this, abstractC0283l);
            }
        } else {
            c12169l = new C12169l(this, abstractC0283l);
        }
        Object obj = c12169l.f24179l;
        int i2 = c12169l.f24180l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj);
            C15578l c15578l = new C15578l(-667635112, true, new C3411l(this, context, c3445l, 5));
            c12169l.f24180l = 1;
            AbstractC17185l.purchase(c15578l, c12169l);
            return;
        }
        if (i2 != 1) {
            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
        } else {
            AbstractC2829l.crashlytics(obj);
            C17132l.firebase();
        }
    }

    @Override // defpackage.AbstractC5518l
    public final InterfaceC18579l purchase() {
        return this.adcel;
    }
}
