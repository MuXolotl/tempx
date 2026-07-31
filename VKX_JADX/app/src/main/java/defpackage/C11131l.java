package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lُٙۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11131l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ int f22345l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ int f22346l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f22347l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public /* synthetic */ Object f22348l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11131l(int i, int i2, InterfaceC14029l interfaceC14029l, int i3) {
        super(2, interfaceC14029l);
        this.f22347l = i3;
        this.f22345l = i;
        this.f22346l = i2;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f22347l;
        int i2 = this.f22346l;
        int i3 = this.f22345l;
        Object obj2 = this.f22348l;
        switch (i) {
            case 0:
                AbstractC2829l.crashlytics(obj);
                ((C16811l) obj2).mo2795l(i3, i2);
                return Unit.INSTANCE;
            default:
                C7814l c7814l = (C7814l) obj2;
                AbstractC2829l.crashlytics(obj);
                ArrayList arrayList = new ArrayList(c7814l.f16331l);
                Collections.swap(arrayList, i3, i2);
                Unit unit = Unit.INSTANCE;
                return C7814l.loadAd(c7814l, arrayList, null, 0L, null, 1007);
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        switch (this.f22347l) {
            case 0:
                C11131l c11131l = new C11131l(this.f22345l, this.f22346l, interfaceC14029l, 0);
                c11131l.f22348l = obj;
                return c11131l;
            default:
                C11131l c11131l2 = new C11131l(this.f22345l, this.f22346l, interfaceC14029l, 1);
                c11131l2.f22348l = obj;
                return c11131l2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f22347l) {
            case 0:
                return ((C11131l) ads((InterfaceC14029l) obj2, (C16811l) obj)).Signature(Unit.INSTANCE);
            default:
                return ((C11131l) ads((InterfaceC14029l) obj2, (C7814l) obj)).Signature(Unit.INSTANCE);
        }
    }
}
