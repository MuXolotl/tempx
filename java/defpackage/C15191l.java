package defpackage;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lٔۜۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15191l extends AbstractC9694l {

    /* JADX INFO: renamed from: lٟؓٔ, reason: contains not printable characters */
    public final Cgoto f29780l;

    /* JADX INFO: renamed from: lؚؗٞ, reason: contains not printable characters */
    public final /* synthetic */ int f29781l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15191l(String str, int i) {
        super(null);
        this.f29781l = i;
        switch (i) {
            case 4:
                super(null);
                this.f29780l = new C3985l(str);
                break;
            case 5:
                super(null);
                this.f29780l = new C16504l(str, 3);
                break;
            default:
                this.f29780l = new C16504l(str, 0);
                break;
        }
    }

    @Override // defpackage.AbstractC9694l
    /* JADX INFO: renamed from: return */
    public final Cgoto mo781return() {
        switch (this.f29781l) {
            case 0:
                return (C9011l) this.f29780l;
            case 1:
                return (C9351l) this.f29780l;
            case 2:
                return (C9351l) this.f29780l;
            case 3:
                return (C16504l) this.f29780l;
            case 4:
                return (C3985l) this.f29780l;
            default:
                return (C16504l) this.f29780l;
        }
    }

    @Override // defpackage.AbstractC9694l, defpackage.InterfaceC1982l
    public boolean subscription() {
        switch (this.f29781l) {
            case 0:
                return false;
            default:
                return super.subscription();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15191l() {
        super(null);
        this.f29781l = 0;
        this.f29780l = new C9011l(11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15191l(String str, Function0 function0) {
        super(str);
        this.f29781l = 1;
        this.f29780l = new C9351l(0, function0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15191l(C1329l c1329l) {
        super(null);
        this.f29781l = 2;
        this.f29780l = new C9351l(1, c1329l);
    }
}
