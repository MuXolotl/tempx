package defpackage;

import android.content.Context;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lْٔؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14863l implements InterfaceC14544l {
    public boolean crashlytics;
    public final C4264l loadAd;
    public final Context yandex;

    public C14863l(Context context) {
        this.yandex = context;
        C8662l c8662l = new C8662l(context);
        AbstractC12442l.subscription(!c8662l.crashlytics);
        C4264l c4264l = new C4264l(c8662l);
        c8662l.crashlytics = true;
        this.loadAd = c4264l;
    }

    @Override // defpackage.InterfaceC14544l
    public final void crashlytics() {
        if (this.crashlytics) {
            return;
        }
        this.loadAd.getClass();
    }

    @Override // defpackage.InterfaceC14544l
    public final C1770l loadAd() {
        return this.loadAd.loadAd();
    }

    @Override // defpackage.InterfaceC14544l
    public final C16543l yandex(C13572l c13572l, AbstractC1186l abstractC1186l, C5138l c5138l, C0743l c0743l) {
        if (!this.crashlytics) {
            return this.loadAd.yandex(c13572l, abstractC1186l, c5138l, c0743l);
        }
        Context context = this.yandex;
        C11757l c11757l = new C11757l(context, "default_channel_id");
        c11757l.purchase = C11757l.crashlytics(context.getString(R.string.op_resume));
        c11757l.billing = C11757l.crashlytics(context.getString(R.string.op_resume_text));
        c11757l.isVip.icon = R.drawable.op_brand_icon;
        return new C16543l(c11757l.loadAd());
    }
}
