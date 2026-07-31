package defpackage;

import android.graphics.Bitmap;
import android.util.Log;
import java.util.concurrent.ExecutorService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؘِۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11671l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f23386l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f23387l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f23388l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11671l(InterfaceC14029l interfaceC14029l, C1130l c1130l) {
        super(2, interfaceC14029l);
        this.f23387l = 9;
        this.f23386l = c1130l;
    }

    private final Object pro(Object obj) {
        C9426l c9426l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        int i = this.f23388l;
        if (i == 0) {
            AbstractC2829l.crashlytics(obj);
            if (AbstractC5088l.firebase("CXCP")) {
                Log.d("CXCP", "Closing " + ((C1130l) this.f23386l));
            }
            C16047l c16047l = ((C1130l) this.f23386l).yandex;
            if (c16047l.purchase.yandex()) {
                AutoCloseable autoCloseableYandex = c16047l.yandex();
                if (autoCloseableYandex instanceof AutoCloseable) {
                    autoCloseableYandex.close();
                } else {
                    if (!(autoCloseableYandex instanceof ExecutorService)) {
                        C11983l.crashlytics();
                        return null;
                    }
                    AbstractC14238l.subscription((ExecutorService) autoCloseableYandex);
                }
            }
            C4271l c4271l = (C4271l) ((C1130l) this.f23386l).subs.getValue();
            synchronized (c4271l.purchase) {
                try {
                    c9426l = c4271l.subs;
                    if (c9426l == null) {
                        C11268l c11268l = c4271l.billing;
                        if (c11268l != null) {
                            c11268l.ads(null);
                        }
                        c4271l.crashlytics.subs();
                        c4271l.admob = null;
                        c9426l = new C9426l();
                        c4271l.subs = c9426l;
                        c4271l.mopub();
                    } else if (AbstractC5088l.metrica()) {
                        Log.w("CXCP", "UseCaseSurfaceManager is already stopping!");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f23388l = 1;
            if (c9426l.firebase(this) == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC2829l.crashlytics(obj);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:155:0x02d1, code lost:
    
        if (defpackage.AbstractC10999l.firebase(r15, r1, r14) == r5) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x02eb, code lost:
    
        if (defpackage.AbstractC10999l.firebase(r1, r3, r14) == r5) goto L160;
     */
    @Override // defpackage.AbstractC12050l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object Signature(java.lang.Object r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1114
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C11671l.Signature(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        int i = this.f23387l;
        Object obj2 = this.f23386l;
        switch (i) {
            case 0:
                return new C11671l((C11268l) obj2, interfaceC14029l, 0);
            case 1:
                return new C11671l((C0412l) obj2, interfaceC14029l, 1);
            case 2:
                return new C11671l((C13954l) obj2, interfaceC14029l, 2);
            case 3:
                return new C11671l((C17274l) obj2, interfaceC14029l, 3);
            case 4:
                return new C11671l((C17723l) obj2, interfaceC14029l, 4);
            case 5:
                return new C11671l((C0113l) obj2, interfaceC14029l, 5);
            case 6:
                return new C11671l((C6473l) obj2, interfaceC14029l, 6);
            case 7:
                return new C11671l((C12842l) obj2, interfaceC14029l, 7);
            case 8:
                return new C11671l((C1930l) obj2, interfaceC14029l, 8);
            case 9:
                return new C11671l(interfaceC14029l, (C1130l) obj2);
            case 10:
                return new C11671l((Bitmap) obj2, interfaceC14029l, 10);
            case 11:
                return new C11671l((C5364l) obj2, interfaceC14029l, 11);
            case 12:
                return new C11671l((C15035l) obj2, interfaceC14029l, 12);
            case 13:
                return new C11671l((C9135l) obj2, interfaceC14029l, 13);
            case 14:
                return new C11671l((InterfaceC15829l) obj2, interfaceC14029l, 14);
            case 15:
                return new C11671l((C3095l) obj2, interfaceC14029l, 15);
            default:
                return new C11671l((C13904l) obj2, interfaceC14029l, 16);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj2;
        switch (this.f23387l) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
        }
        return ((C11671l) ads(interfaceC14029l, interfaceC2262l)).Signature(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11671l(Object obj, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f23387l = i;
        this.f23386l = obj;
    }
}
