package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٍٔٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C14793l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Function1 f28932l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ boolean f28933l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f28934l = 1;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ boolean f28935l;

    public /* synthetic */ C14793l(boolean z, Function1 function1, boolean z2) {
        this.f28933l = z;
        this.f28932l = function1;
        this.f28935l = z2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f28934l) {
            case 0:
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c6956l.m2124else();
                } else if (this.f28933l) {
                    c6956l.m2123default(-1046299973);
                    AbstractC2021l.yandex(this.f28935l, this.f28932l, null, true, null, c6956l, 0, 108);
                    c6956l.startapp(false);
                } else {
                    c6956l.m2123default(-1046081640);
                    AbstractC4597l.yandex(AbstractC3234l.billing(), null, AbstractC3605l.vip(C4346l.f8873l, 12.0f, 0.0f, 2), 0L, c6956l, 432, 8);
                    c6956l.startapp(false);
                }
                break;
            default:
                C6956l c6956l2 = (C6956l) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    AbstractC2021l.yandex(this.f28933l, this.f28932l, null, this.f28935l, null, c6956l2, 0, 108);
                } else {
                    c6956l2.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C14793l(boolean z, boolean z2, Function1 function1) {
        this.f28933l = z;
        this.f28935l = z2;
        this.f28932l = function1;
    }
}
