package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؑؐۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0014l implements Function1 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C4456l f868l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f869l;

    public /* synthetic */ C0014l(C4456l c4456l, int i) {
        this.f869l = i;
        this.f868l = c4456l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f869l;
        C4456l c4456l = this.f868l;
        switch (i) {
            case 0:
                ((Boolean) obj).getClass();
                C10086l c10086l = c4456l.f9074l;
                c10086l.setValue(Boolean.valueOf(!((Boolean) c10086l.getValue()).booleanValue()));
                break;
            default:
                new C9231l((List) obj).Signature(c4456l.f5081l);
                break;
        }
        return Unit.INSTANCE;
    }
}
