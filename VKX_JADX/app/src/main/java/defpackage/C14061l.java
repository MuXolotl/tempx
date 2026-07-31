package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lَٓ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14061l {
    public final /* synthetic */ C15389l amazon;
    public float crashlytics = Float.NaN;
    public Object loadAd;
    public Object yandex;

    public C14061l(C15389l c15389l) {
        this.amazon = c15389l;
    }

    public final void yandex(float f, float f2) {
        C15389l c15389l = this.amazon;
        C13765l c13765l = (C13765l) c15389l.subs;
        float fAdmob = c13765l.admob();
        c13765l.subs(f);
        ((C13765l) c15389l.isPro).subs(f2);
        if (Float.isNaN(fAdmob)) {
            return;
        }
        boolean z = f >= fAdmob;
        C18416l c18416lSubs = c15389l.subs();
        C10086l c10086l = (C10086l) c15389l.crashlytics;
        if (c13765l.admob() == c18416lSubs.billing(c10086l.getValue())) {
            Object objLoadAd = c15389l.subs().loadAd(c13765l.admob() + (z ? 1.0f : -1.0f), z);
            if (objLoadAd == null) {
                objLoadAd = c10086l.getValue();
            }
            if (z) {
                this.yandex = c10086l.getValue();
                this.loadAd = objLoadAd;
            } else {
                this.yandex = objLoadAd;
                this.loadAd = c10086l.getValue();
            }
        } else {
            Object objLoadAd2 = c15389l.subs().loadAd(c13765l.admob(), false);
            if (objLoadAd2 == null) {
                objLoadAd2 = c10086l.getValue();
            }
            Object objLoadAd3 = c15389l.subs().loadAd(c13765l.admob(), true);
            if (objLoadAd3 == null) {
                objLoadAd3 = c10086l.getValue();
            }
            this.yandex = objLoadAd2;
            this.loadAd = objLoadAd3;
        }
        this.crashlytics = Math.abs(c15389l.subs().billing(this.yandex) - c15389l.subs().billing(this.loadAd));
        if (Math.abs(c13765l.admob() - c15389l.subs().billing(c10086l.getValue())) >= this.crashlytics / 2.0f) {
            Object value = z ? this.loadAd : this.yandex;
            if (value == null) {
                value = c10086l.getValue();
            }
            if (((Boolean) ((Function1) c15389l.yandex).invoke(value)).booleanValue()) {
                c15389l.remoteconfig(value);
            }
        }
    }
}
