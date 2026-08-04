package defpackage;

/* JADX INFO: renamed from: lٓۧؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final enum C14562l extends EnumC16675l {
    public C14562l() {
        super("UTF8", 1);
    }

    @Override // defpackage.EnumC16675l
    public final String loadAd() {
        return "UTF8";
    }

    @Override // defpackage.EnumC16675l
    public final byte[] yandex(char[] cArr) {
        return AbstractC11186l.PKCS5PasswordToUTF8Bytes(cArr);
    }
}
