package defpackage;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lٍؗۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9351l extends Cgoto {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ int f19182l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Object f19183l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9351l(int i, Object obj) {
        super(11);
        this.f19182l = i;
        this.f19183l = obj;
    }

    @Override // defpackage.Cgoto
    /* JADX INFO: renamed from: lؑٞۘ */
    public boolean mo203l() {
        switch (this.f19182l) {
            case 1:
                return false;
            case 2:
                return false;
            case 3:
                return false;
            default:
                return super.mo203l();
        }
    }

    @Override // defpackage.Cgoto
    /* JADX INFO: renamed from: lّٔ٘ */
    public final AbstractC8189l mo226l() {
        int i = this.f19182l;
        Object obj = this.f19183l;
        switch (i) {
            case 0:
                return (AbstractC8189l) ((Function0) obj).invoke();
            case 1:
                return (AbstractC8189l) ((C1329l) obj).invoke();
            case 2:
                return new C12772l("", 13);
            default:
                String str = (String) ((C13220l) obj).f26001l.getValue();
                return new C12772l(14, str, null, !AbstractC12024l.m3315catch(str));
        }
    }

    @Override // defpackage.Cgoto
    /* JADX INFO: renamed from: lٔ٘۠ */
    public AbstractC14412l mo227l() {
        switch (this.f19182l) {
            case 1:
                return new C7511l();
            case 2:
                C1990l c1990l = new C1990l(12);
                C4817l c4817l = (C4817l) this.f19183l;
                return new C11446l(c1990l, new C7730l(22, c4817l), null, new C17015l(25, c4817l), true, false, null, 100);
            case 3:
                return new C7511l();
            default:
                return super.mo227l();
        }
    }
}
