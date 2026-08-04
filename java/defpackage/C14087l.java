package defpackage;

import android.util.Log;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lُِٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14087l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ C10700l f27445l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ String f27446l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f27447l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public /* synthetic */ Object f27448l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14087l(C10700l c10700l, String str, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f27447l = i;
        this.f27445l = c10700l;
        this.f27446l = str;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f27447l;
        C10700l c10700l = this.f27445l;
        String str = this.f27446l;
        switch (i) {
            case 0:
                AbstractC2829l.crashlytics(obj);
                C10785l c10785l = (C10785l) this.f27448l;
                Log.d("CXCP", "tryOpenCamera: openCamera() for " + ((Object) C10160l.loadAd(str)) + " returned");
                c10700l.f21708l = null;
                return c10785l;
            default:
                AbstractC2829l.crashlytics(obj);
                C10785l c10785l2 = (C10785l) this.f27448l;
                Log.d("CXCP", "tryOpenCamera: " + ((Object) C10160l.loadAd(str)) + " opened");
                c10700l.f21708l = null;
                return c10785l2;
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        int i = this.f27447l;
        String str = this.f27446l;
        C10700l c10700l = this.f27445l;
        switch (i) {
            case 0:
                C14087l c14087l = new C14087l(c10700l, str, interfaceC14029l, 0);
                c14087l.f27448l = obj;
                return c14087l;
            default:
                C14087l c14087l2 = new C14087l(c10700l, str, interfaceC14029l, 1);
                c14087l2.f27448l = obj;
                return c14087l2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C10785l c10785l = (C10785l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj2;
        switch (this.f27447l) {
            case 0:
                break;
        }
        return ((C14087l) ads(interfaceC14029l, c10785l)).Signature(Unit.INSTANCE);
    }
}
