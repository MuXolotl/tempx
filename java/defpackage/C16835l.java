package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٜٗؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16835l extends AbstractC16915l implements Function1 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C5056l f32867l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f32868l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16835l(C5056l c5056l, int i) {
        super(1);
        this.f32868l = i;
        this.f32867l = c5056l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f32868l;
        C5056l c5056l = this.f32867l;
        switch (i) {
            case 0:
                ((C6148l) obj).pro(C1187l.billing(c5056l.purchase()));
                break;
            case 1:
                ((C6148l) obj).Signature(C1187l.purchase(c5056l.purchase()));
                break;
            case 2:
                ((C6148l) obj).pro(C1187l.billing(((C1187l) c5056l.tapsense.amazon()).yandex));
                break;
            default:
                ((C6148l) obj).Signature(C1187l.purchase(((C1187l) c5056l.tapsense.amazon()).yandex));
                break;
        }
        return Unit.INSTANCE;
    }
}
