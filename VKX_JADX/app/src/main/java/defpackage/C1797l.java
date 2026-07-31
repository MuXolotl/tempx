package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lِؓۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1797l implements Function0 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C0939l f4210l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f4211l;

    public /* synthetic */ C1797l(C0939l c0939l, int i) {
        this.f4211l = i;
        this.f4210l = c0939l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f4211l;
        C0939l c0939l = this.f4210l;
        switch (i) {
            case 0:
                return Float.valueOf(c0939l.f2620l.admob());
            case 1:
                c0939l.m764this(true);
                return Unit.INSTANCE;
            case 2:
                c0939l.m764this(false);
                return Unit.INSTANCE;
            case 3:
                c0939l.m764this(false);
                AbstractC10999l.mopub(AbstractC11990l.firebase(c0939l), null, 0, new C17972l(c0939l, (InterfaceC14029l) null, 11), 3);
                return Unit.INSTANCE;
            case 4:
                c0939l.f2618l.setValue(Boolean.valueOf(!c0939l.m761finally()));
                c0939l.f2619l.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 5:
                C10086l c10086l = c0939l.f2619l;
                c10086l.setValue(Boolean.valueOf(true ^ ((Boolean) c10086l.getValue()).booleanValue()));
                c0939l.f2618l.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 6:
                C10086l c10086l2 = c0939l.f2617l;
                c10086l2.setValue(Boolean.valueOf(!((Boolean) c10086l2.getValue()).booleanValue()));
                return Unit.INSTANCE;
            case 7:
                c0939l.m764this(false);
                return Unit.INSTANCE;
            default:
                c0939l.m764this(false);
                return Unit.INSTANCE;
        }
    }
}
