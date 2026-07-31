package defpackage;

/* JADX INFO: renamed from: lؚٕ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7561l {
    public static final C13708l amazon;
    public static final C13708l crashlytics;
    public static final C13708l loadAd;
    public static final AbstractC8481l yandex = AbstractC8481l.Signature("_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire");

    static {
        Object[] objArr = {"_e", "_f", "_iap", "_s", "_au", "_ui", "_cd"};
        AbstractC13743l.yandex(7, objArr);
        loadAd = AbstractC1186l.vip(7, objArr);
        Object[] objArr2 = {"auto", "app", "am"};
        AbstractC13743l.yandex(3, objArr2);
        crashlytics = AbstractC1186l.vip(3, objArr2);
        amazon = AbstractC1186l.signatures("_r", "_dbg");
        C16971l c16971l = new C16971l(4);
        c16971l.billing(AbstractC8020l.purchase);
        c16971l.billing(AbstractC8020l.billing);
        c16971l.mopub();
        AbstractC1186l.signatures("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");
    }
}
