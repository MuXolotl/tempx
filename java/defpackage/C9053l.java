package defpackage;

/* JADX INFO: renamed from: lٌۛۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9053l extends C17951l {

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public static final byte[] f18635l = new byte[100];

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public byte[] f18636l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9053l(byte[] bArr, int i, byte[] bArr2) {
        super(i, EnumC2441l.f5219l);
        C17951l.smaato(i);
        if ((bArr == null || bArr.length == 0) && (bArr2 == null || bArr2.length == 0)) {
            this.f18636l = null;
        } else {
            this.f18636l = AbstractC14024l.admob(AbstractC13766l.mopub(this.f11570l / 8), (bArr == null || bArr.length == 0) ? AbstractC13766l.mopub(0L) : AbstractC14024l.mopub(AbstractC13766l.mopub(((long) bArr.length) * 8), bArr), (bArr2 == null || bArr2.length == 0) ? AbstractC13766l.mopub(0L) : AbstractC14024l.mopub(AbstractC13766l.mopub(((long) bArr2.length) * 8), bArr2));
            vip();
        }
    }

    @Override // defpackage.C17951l, defpackage.C5394l, defpackage.InterfaceC16922l
    public final String getAlgorithmName() {
        return "CSHAKE" + this.f11571l;
    }

    @Override // defpackage.C17951l, defpackage.InterfaceC11512l
    public final void loadAd(InterfaceC11512l interfaceC11512l) {
        C9053l c9053l = (C9053l) interfaceC11512l;
        admob(c9053l);
        this.f18636l = AbstractC14024l.crashlytics(c9053l.f18636l);
    }

    @Override // defpackage.C17951l
    public final int remoteconfig(int i, int i2, byte[] bArr) {
        if (this.f18636l == null) {
            super.remoteconfig(i, i2, bArr);
            return i2;
        }
        if (!this.f11566l) {
            mopub(0, 2);
        }
        firebase(((long) i2) * 8, bArr, i);
        return i2;
    }

    @Override // defpackage.C5394l, defpackage.InterfaceC16922l
    public final void reset() {
        super.reset();
        if (this.f18636l != null) {
            vip();
        }
    }

    public final void vip() {
        int i = this.f11570l / 8;
        byte[] bArr = this.f18636l;
        billing(0, bArr.length, bArr);
        int length = this.f18636l.length % i;
        if (length == 0) {
            return;
        }
        int i2 = i - length;
        while (true) {
            byte[] bArr2 = f18635l;
            if (i2 <= 100) {
                billing(0, i2, bArr2);
                return;
            } else {
                billing(0, 100, bArr2);
                i2 -= 100;
            }
        }
    }

    @Override // defpackage.C17951l, defpackage.InterfaceC11512l
    public final InterfaceC11512l yandex() {
        return new C9053l(this);
    }

    public C9053l(C9053l c9053l) {
        super(c9053l);
        this.f18636l = AbstractC14024l.crashlytics(c9053l.f18636l);
    }
}
