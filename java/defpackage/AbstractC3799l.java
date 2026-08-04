package defpackage;

/* JADX INFO: renamed from: lؕۧٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3799l extends AbstractC11779l {

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final byte[] f7909l = new byte[0];

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final AbstractC8481l f7908l = AbstractC8481l.Signature(EnumC17969l.ALBUM, EnumC17969l.ARTIST, EnumC17969l.TITLE, EnumC17969l.TRACK, EnumC17969l.GENRE, EnumC17969l.COMMENT, EnumC17969l.YEAR);

    @Override // defpackage.InterfaceC15476l
    public final AbstractC17238l purchase(EnumC17969l enumC17969l) {
        AbstractC6745l.loadAd(enumC17969l, "genericKey");
        return subscription(enumC17969l.name());
    }

    @Override // defpackage.InterfaceC15476l
    public final InterfaceC4656l smaato(AbstractC5859l abstractC5859l) {
        throw new C6451l("COVER_ART", 18, (byte) 0);
    }

    @Override // defpackage.InterfaceC15476l
    public AbstractC8481l vip() {
        return f7908l;
    }

    @Override // defpackage.InterfaceC15476l
    public final InterfaceC4656l yandex(EnumC17969l enumC17969l, String... strArr) {
        AbstractC6745l.loadAd(enumC17969l, "genericKey");
        if (vip().contains(enumC17969l)) {
            return new C7932l(enumC17969l.name(), (String) AbstractC6745l.crashlytics(strArr));
        }
        throw new C6451l(enumC17969l.name(), 18, (byte) 0);
    }
}
