package defpackage;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lٜؕۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3664l extends Cgoto {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ int f7721l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC2484l f7722l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Object f7723l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3664l(C11148l c11148l, String str) {
        super(11);
        this.f7721l = 2;
        this.f7722l = c11148l;
        this.f7723l = str;
    }

    @Override // defpackage.Cgoto
    /* JADX INFO: renamed from: lؑٞۘ */
    public final boolean mo203l() {
        switch (this.f7721l) {
        }
        return false;
    }

    @Override // defpackage.Cgoto
    /* JADX INFO: renamed from: lّٔ٘ */
    public final AbstractC8189l mo226l() {
        int i = this.f7721l;
        Object obj = this.f7723l;
        switch (i) {
            case 0:
                return new C12772l((String) obj, 5);
            case 1:
                return (AbstractC8189l) ((Function0) obj).invoke();
            default:
                return new C12772l(26, (String) ((C11148l) this.f7722l).f22411l.getValue(), (String) obj, false);
        }
    }

    @Override // defpackage.Cgoto
    /* JADX INFO: renamed from: lٔ٘۠ */
    public final AbstractC14412l mo227l() {
        int i = this.f7721l;
        AbstractC2484l abstractC2484l = this.f7722l;
        switch (i) {
            case 0:
                return new C3497l((C13379l) abstractC2484l, false, true, 102);
            case 1:
                return new C3497l((C10266l) abstractC2484l, false, true, 118);
            default:
                return new C7511l();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3664l(Object obj, AbstractC9694l abstractC9694l, int i) {
        super(11);
        this.f7721l = i;
        this.f7723l = obj;
        this.f7722l = abstractC9694l;
    }
}
