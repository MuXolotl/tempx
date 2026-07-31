package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: lۣٗؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16909l extends AbstractC16682l implements InterfaceC0805l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f32976l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f32977l = 1;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Object f32978l;

    /* JADX WARN: Illegal instructions before constructor call */
    public C16909l(C13154l c13154l, C3800l c3800l) {
        C13772l c13772l = C13772l.f26879l;
        this.f32976l = c13154l;
        this.f32978l = c3800l;
        super(c13772l);
    }

    @Override // defpackage.InterfaceC0805l
    /* JADX INFO: renamed from: continue */
    public final void mo685continue(InterfaceC12932l interfaceC12932l, Throwable th) throws Throwable {
        int i = this.f32977l;
        Object obj = this.f32978l;
        Object obj2 = this.f32976l;
        switch (i) {
            case 0:
                ((InterfaceC6272l) ((C14187l) obj2).f14095l.f20462l).amazon("Failed to load module", th);
                ((ArrayList) obj).add(th);
                return;
            default:
                C3800l c3800l = (C3800l) obj;
                AbstractC3605l.Signature(th, new C12242l((C13154l) obj2, c3800l, 7));
                InterfaceC0805l interfaceC0805l = (InterfaceC0805l) c3800l.f7913l.mo245l(C13772l.f26879l);
                if (interfaceC0805l == null) {
                    throw th;
                }
                interfaceC0805l.mo685continue(interfaceC12932l, th);
                return;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C16909l(C14187l c14187l, ArrayList arrayList) {
        C13772l c13772l = C13772l.f26879l;
        this.f32976l = c14187l;
        this.f32978l = arrayList;
        super(c13772l);
    }
}
