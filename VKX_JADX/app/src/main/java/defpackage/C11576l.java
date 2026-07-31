package defpackage;

import java.util.ArrayList;
import kotlin.Unit;

/* JADX INFO: renamed from: lِِؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11576l implements InterfaceC13342l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C4791l f23260l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C2552l f23261l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ C18662l f23262l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ C10700l f23263l;

    public C11576l(C18662l c18662l, C2552l c2552l, C4791l c4791l, C10700l c10700l) {
        this.f23262l = c18662l;
        this.f23261l = c2552l;
        this.f23260l = c4791l;
        this.f23263l = c10700l;
    }

    @Override // defpackage.InterfaceC13342l
    public final void ads(InterfaceC3177l interfaceC3177l, EnumC14812l enumC14812l) {
        switch (AbstractC12256l.yandex[enumC14812l.ordinal()]) {
            case 1:
                AbstractC10999l.mopub(this.f23262l, null, 4, new C8036l(this.f23263l, this.f23260l, interfaceC3177l, this, null, 16), 1);
                return;
            case 2:
                C2552l c2552l = this.f23261l;
                if (c2552l != null) {
                    C11919l c11919l = (C11919l) c2552l.f5556l;
                    synchronized (c11919l.f23763l) {
                        try {
                            if (!c11919l.smaato()) {
                                ArrayList arrayList = (ArrayList) c11919l.f23767l;
                                c11919l.f23767l = (ArrayList) c11919l.f23766l;
                                c11919l.f23766l = arrayList;
                                c11919l.f23764l = true;
                                int size = arrayList.size();
                                for (int i = 0; i < size; i++) {
                                    ((InterfaceC14029l) arrayList.get(i)).subs(Unit.INSTANCE);
                                }
                                arrayList.clear();
                                Unit unit = Unit.INSTANCE;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                }
                this.f23260l.m1611switch();
                return;
            case 3:
                this.f23260l.m1607native();
                return;
            case 4:
                this.f23260l.applovin();
                return;
            case 5:
            case 6:
            case 7:
                return;
            default:
                C18725l.billing();
                return;
        }
    }
}
