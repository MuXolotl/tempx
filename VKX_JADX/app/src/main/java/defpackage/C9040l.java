package defpackage;

import android.text.format.Formatter;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lٌۛؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9040l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public /* synthetic */ Object f18604l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f18605l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ long f18606l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9040l(AbstractC11801l abstractC11801l, long j, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f18605l = i;
        this.f18604l = abstractC11801l;
        this.f18606l = j;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f18605l;
        long j = this.f18606l;
        switch (i) {
            case 0:
                AbstractC2829l.crashlytics(obj);
                C17284l c17284l = (C17284l) this.f18604l;
                c17284l.f33540l.setValue(Boolean.FALSE);
                AbstractC11708l.yandex(new C15245l(0, c17284l.isVip(), c17284l.isVip().getString(R.string.cache_migration_success, Formatter.formatFileSize(c17284l.isVip(), j))));
                break;
            case 1:
                AbstractC2829l.crashlytics(obj);
                C4154l c4154l = ((C15222l) this.f18604l).yandex;
                c4154l.amazon(c4154l.firebase, j, 1);
                break;
            default:
                AbstractC2829l.crashlytics(obj);
                C6111l c6111l = (C6111l) this.f18604l;
                c6111l.f12902l.setValue(Boolean.FALSE);
                AbstractC11708l.yandex(new C15245l(0, c6111l.isVip(), c6111l.isVip().getString(R.string.cache_migration_success, Formatter.formatFileSize(c6111l.isVip(), j))));
                break;
        }
        return Unit.INSTANCE;
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        switch (this.f18605l) {
            case 0:
                return new C9040l((C17284l) this.f18604l, this.f18606l, interfaceC14029l, 0);
            case 1:
                C9040l c9040l = new C9040l(this.f18606l, interfaceC14029l);
                c9040l.f18604l = obj;
                return c9040l;
            default:
                return new C9040l((C6111l) this.f18604l, this.f18606l, interfaceC14029l, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f18605l) {
            case 0:
                return ((C9040l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 1:
                return ((C9040l) ads((InterfaceC14029l) obj2, (C15222l) obj)).Signature(Unit.INSTANCE);
            default:
                return ((C9040l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9040l(long j, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f18605l = 1;
        this.f18606l = j;
    }
}
