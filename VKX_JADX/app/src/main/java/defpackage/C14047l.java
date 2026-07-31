package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.Log;
import android.view.View;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٍٓۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14047l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f27385l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f27386l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public /* synthetic */ boolean f27387l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14047l(InterfaceC14029l interfaceC14029l, C1130l c1130l, boolean z) {
        super(2, interfaceC14029l);
        this.f27386l = 5;
        this.f27385l = c1130l;
        this.f27387l = z;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        switch (this.f27386l) {
            case 0:
                AbstractC2829l.crashlytics(obj);
                if (!this.f27387l) {
                    ((C0358l) this.f27385l).loadAd.premium(-1);
                }
                return Unit.INSTANCE;
            case 1:
                AbstractC2829l.crashlytics(obj);
                if (!this.f27387l) {
                    ((C15178l) this.f27385l).yandex();
                }
                return Unit.INSTANCE;
            case 2:
                AbstractC2829l.crashlytics(obj);
                C9478l c9478l = ((C18572l) this.f27385l).f36260l;
                boolean z = this.f27387l;
                if (c9478l.purchase != z) {
                    c9478l.purchase = z;
                    if (z && c9478l.amazon) {
                        ((ValueAnimator) c9478l.billing.subs()).resume();
                    }
                }
                return Unit.INSTANCE;
            case 3:
                AbstractC2829l.crashlytics(obj);
                C13220l c13220l = (C13220l) this.f27385l;
                C11390l c11390l = c13220l.f25997l;
                List list = c13220l.f25998l;
                C11362l c11362l = c11390l.mopub;
                c11362l.clear();
                c11362l.addAll(list);
                if (this.f27387l) {
                    C11560l c11560l = c13220l.f26003l;
                    if (c11560l != null) {
                        AbstractC5833l.subs(c11560l);
                    }
                    View view = c13220l.f25996l;
                    if (view != null) {
                        AbstractC5833l.purchase(view);
                    }
                } else {
                    View view2 = c13220l.f25996l;
                    if (view2 != null) {
                        AbstractC5833l.subs(view2);
                    }
                    C11560l c11560l2 = c13220l.f26003l;
                    if (c11560l2 != null) {
                        AbstractC5833l.purchase(c11560l2);
                    }
                }
                C12291l c12291l = new C12291l(c13220l);
                C11560l c11560l3 = c13220l.f30818l;
                if (c11560l3 == null) {
                    c11560l3 = null;
                }
                c11560l3.setAdapter(c12291l);
                return Unit.INSTANCE;
            case 4:
                AbstractC2829l.crashlytics(obj);
                AbstractC12357l.yandex((Context) this.f27385l, RescheduleReceiver.class, this.f27387l);
                return Unit.INSTANCE;
            default:
                AbstractC2829l.crashlytics(obj);
                if (!((C1130l) this.f27385l).admob.loadAd()) {
                    C2667l c2667lYandex = ((C1130l) this.f27385l).yandex.yandex();
                    boolean z2 = this.f27387l;
                    C7276l c7276l = c2667lYandex.f5784l;
                    synchronized (c7276l.startapp) {
                        c7276l.adcel = z2;
                        Unit unit = Unit.INSTANCE;
                    }
                } else if (AbstractC5088l.firebase("CXCP")) {
                    Log.d("CXCP", "UseCaseCamera is closed before setActiveResumeMode, skipping setup.");
                }
                return Unit.INSTANCE;
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        int i = this.f27386l;
        Object obj2 = this.f27385l;
        switch (i) {
            case 0:
                return new C14047l(this.f27387l, (C0358l) obj2, interfaceC14029l);
            case 1:
                C14047l c14047l = new C14047l((C15178l) obj2, interfaceC14029l, 1);
                c14047l.f27387l = ((Boolean) obj).booleanValue();
                return c14047l;
            case 2:
                return new C14047l((C18572l) obj2, this.f27387l, interfaceC14029l, 2);
            case 3:
                return new C14047l((C13220l) obj2, this.f27387l, interfaceC14029l, 3);
            case 4:
                C14047l c14047l2 = new C14047l((Context) obj2, interfaceC14029l, 4);
                c14047l2.f27387l = ((Boolean) obj).booleanValue();
                return c14047l2;
            default:
                return new C14047l(interfaceC14029l, (C1130l) obj2, this.f27387l);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f27386l) {
            case 0:
                return ((C14047l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((C14047l) ads((InterfaceC14029l) obj2, bool)).Signature(Unit.INSTANCE);
            case 2:
                return ((C14047l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 3:
                return ((C14047l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 4:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                return ((C14047l) ads((InterfaceC14029l) obj2, bool2)).Signature(Unit.INSTANCE);
            default:
                return ((C14047l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14047l(Object obj, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f27386l = i;
        this.f27385l = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14047l(Object obj, boolean z, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f27386l = i;
        this.f27385l = obj;
        this.f27387l = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14047l(boolean z, C0358l c0358l, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f27386l = 0;
        this.f27387l = z;
        this.f27385l = c0358l;
    }
}
