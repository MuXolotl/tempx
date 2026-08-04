package defpackage;

/* JADX INFO: renamed from: lُٓٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11030l implements InterfaceC6357l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final int f22221l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final InterfaceC6357l f22222l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f22223l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final int f22224l;

    public /* synthetic */ C11030l(InterfaceC6357l interfaceC6357l, int i, int i2, int i3) {
        this.f22223l = i3;
        this.f22222l = interfaceC6357l;
        this.f22221l = i;
        this.f22224l = i2;
    }

    @Override // defpackage.InterfaceC6357l
    public final Object Signature() {
        switch (this.f22223l) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.f22222l.Signature();
    }

    @Override // defpackage.InterfaceC6357l
    public final AbstractC10113l adcel(long j) {
        switch (this.f22223l) {
            case 0:
                InterfaceC6357l interfaceC6357l = this.f22222l;
                int i = this.f22224l;
                int i2 = this.f22221l;
                if (i == 1) {
                    return new C1346l(i2 == 2 ? interfaceC6357l.metrica(C15519l.mopub(j)) : interfaceC6357l.remoteconfig(C15519l.mopub(j)), C15519l.crashlytics(j) ? C15519l.mopub(j) : 32767, 0);
                }
                return new C1346l(C15519l.amazon(j) ? C15519l.admob(j) : 32767, i2 == 2 ? interfaceC6357l.crashlytics(C15519l.admob(j)) : interfaceC6357l.mo1460for(C15519l.admob(j)), 0);
            case 1:
                InterfaceC6357l interfaceC6357l2 = this.f22222l;
                int i3 = this.f22224l;
                int i4 = this.f22221l;
                if (i3 == 1) {
                    return new C1346l(i4 == 2 ? interfaceC6357l2.metrica(C15519l.mopub(j)) : interfaceC6357l2.remoteconfig(C15519l.mopub(j)), C15519l.crashlytics(j) ? C15519l.mopub(j) : 32767, 1);
                }
                return new C1346l(C15519l.amazon(j) ? C15519l.admob(j) : 32767, i4 == 2 ? interfaceC6357l2.crashlytics(C15519l.admob(j)) : interfaceC6357l2.mo1460for(C15519l.admob(j)), 1);
            default:
                InterfaceC6357l interfaceC6357l3 = this.f22222l;
                int i5 = this.f22224l;
                int i6 = this.f22221l;
                if (i5 == 1) {
                    return new C1346l(i6 == 2 ? interfaceC6357l3.metrica(C15519l.mopub(j)) : interfaceC6357l3.remoteconfig(C15519l.mopub(j)), C15519l.crashlytics(j) ? C15519l.mopub(j) : 32767, 2);
                }
                return new C1346l(C15519l.amazon(j) ? C15519l.admob(j) : 32767, i6 == 2 ? interfaceC6357l3.crashlytics(C15519l.admob(j)) : interfaceC6357l3.mo1460for(C15519l.admob(j)), 2);
        }
    }

    @Override // defpackage.InterfaceC6357l
    public final int crashlytics(int i) {
        switch (this.f22223l) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.f22222l.crashlytics(i);
    }

    @Override // defpackage.InterfaceC6357l
    /* JADX INFO: renamed from: for */
    public final int mo1460for(int i) {
        switch (this.f22223l) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.f22222l.mo1460for(i);
    }

    @Override // defpackage.InterfaceC6357l
    public final int metrica(int i) {
        switch (this.f22223l) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.f22222l.metrica(i);
    }

    @Override // defpackage.InterfaceC6357l
    public final int remoteconfig(int i) {
        switch (this.f22223l) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.f22222l.remoteconfig(i);
    }
}
