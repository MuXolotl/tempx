package defpackage;

/* JADX INFO: renamed from: lؙۧؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6895l extends C2542l {

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final Cfor f14435l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final Cfor f14436l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final Cfor f14437l;

    public C6895l(C2542l c2542l, Cfor cfor, Cfor cfor2, Cfor cfor3) {
        super(c2542l.f16360l, c2542l.f16358l, c2542l.f16362l, c2542l.f16361l, AbstractC14024l.crashlytics(c2542l.f16359l));
        this.f5539l = cfor;
        if (!cfor.ad(c2542l.f5539l)) {
            C8339l.metrica("named parameters do not match publicKeyParamSet value");
            throw null;
        }
        this.f14435l = cfor;
        this.f14437l = cfor2;
        this.f14436l = cfor3;
    }
}
