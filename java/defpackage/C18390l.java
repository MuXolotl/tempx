package defpackage;

/* JADX INFO: renamed from: lٌٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C18390l extends AbstractC6568l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final byte[] f35921l = {105, 0, 114, 34, 100, -55, 4, 35, -115, 58, -37, -106, 70, -23, 42, -60, 24, -2, -84, -108, 0, -19, 7, 18, -64, -122, -36, -62, -17, 76, -87, 43};

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public C0272l f35922l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C6717l f35923l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public long f35924l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public C13886l f35925l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public boolean f35926l;

    public C18390l(InterfaceC10952l interfaceC10952l) {
        super(interfaceC10952l);
        this.f35924l = 0L;
        this.f35923l = new C6717l(interfaceC10952l, interfaceC10952l.license() * 8);
    }

    @Override // defpackage.InterfaceC10952l
    public final String getAlgorithmName() {
        String algorithmName = this.f35923l.getAlgorithmName();
        return algorithmName.substring(0, algorithmName.indexOf(47)) + "/G" + algorithmName.substring(algorithmName.indexOf(47) + 1);
    }

    @Override // defpackage.InterfaceC10952l
    public final void init(boolean z, InterfaceC9719l interfaceC9719l) {
        byte[] bArr;
        C0272l c0272l;
        C0272l c0272l2;
        this.f35924l = 0L;
        C6717l c6717l = this.f35923l;
        c6717l.init(z, interfaceC9719l);
        this.f35926l = z;
        if (interfaceC9719l instanceof C0272l) {
            C0272l c0272l3 = (C0272l) interfaceC9719l;
            InterfaceC9719l interfaceC9719l2 = c0272l3.f1272l;
            byte[] bArr2 = c0272l3.f1273l;
            interfaceC9719l = interfaceC9719l2;
            bArr = bArr2;
        } else {
            bArr = null;
        }
        if (interfaceC9719l instanceof C6114l) {
            interfaceC9719l = ((C6114l) interfaceC9719l).f12903l;
        }
        if (interfaceC9719l instanceof C2294l) {
            interfaceC9719l = ((C2294l) interfaceC9719l).f4985l;
        }
        C13886l c13886l = (C13886l) interfaceC9719l;
        this.f35925l = c13886l;
        if (c13886l == null && (c0272l2 = this.f35922l) != null) {
            this.f35925l = (C13886l) c0272l2.f1272l;
        }
        this.f35922l = new C0272l(this.f35925l, (bArr != null || (c0272l = this.f35922l) == null) ? AbstractC14024l.crashlytics(c6717l.f14078l) : c0272l.f1273l);
    }

    @Override // defpackage.InterfaceC10952l
    public final int license() {
        return this.f35923l.f14085l;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.AbstractC6568l
    public final byte loadAd(byte b) {
        long j = this.f35924l;
        C6717l c6717l = this.f35923l;
        if (j > 0 && (j & 1023) == 0) {
            InterfaceC10952l interfaceC10952l = c6717l.f13718l;
            interfaceC10952l.init(false, this.f35925l);
            byte[] bArr = new byte[32];
            int iLicense = interfaceC10952l.license();
            for (int i = 0; i < 32; i += iLicense) {
                interfaceC10952l.tapsense(i, i, f35921l, bArr);
            }
            C13886l c13886l = new C13886l(bArr, 0, 32);
            this.f35925l = c13886l;
            interfaceC10952l.init(true, c13886l);
            byte[] bArrCrashlytics = AbstractC14024l.crashlytics(c6717l.f14078l);
            interfaceC10952l.tapsense(0, 0, bArrCrashlytics, bArrCrashlytics);
            c6717l.init(this.f35926l, new C0272l(this.f35925l, bArrCrashlytics));
        }
        this.f35924l++;
        return c6717l.loadAd(b);
    }

    @Override // defpackage.InterfaceC10952l
    public final void reset() {
        this.f35924l = 0L;
        C0272l c0272l = this.f35922l;
        C6717l c6717l = this.f35923l;
        if (c0272l == null) {
            c6717l.reset();
        } else {
            this.f35925l = (C13886l) c0272l.f1272l;
            c6717l.init(this.f35926l, c0272l);
        }
    }

    @Override // defpackage.InterfaceC10952l
    public final int tapsense(int i, int i2, byte[] bArr, byte[] bArr2) {
        C6717l c6717l = this.f35923l;
        processBytes(bArr, i, c6717l.f14085l, bArr2, i2);
        return c6717l.f14085l;
    }
}
