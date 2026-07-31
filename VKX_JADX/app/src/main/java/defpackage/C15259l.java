package defpackage;

import android.util.Log;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٔۢٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15259l extends AbstractC5563l implements Function1 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ C12747l f29851l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ C10700l f29852l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ C10700l f29853l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15259l(C10700l c10700l, C10700l c10700l2, C12747l c12747l, InterfaceC14029l interfaceC14029l) {
        super(1, interfaceC14029l);
        this.f29852l = c10700l;
        this.f29853l = c10700l2;
        this.f29851l = c12747l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        AbstractC2829l.crashlytics(obj);
        Log.d("CXCP", "tryOpenCamera: 3000ms elapsed");
        this.f29852l.f21708l = null;
        if (this.f29853l.f21708l == null) {
            return null;
        }
        Log.e("CXCP", "tryOpenCamera: openCamera() timed out");
        this.f29851l.yandex();
        return new C10785l(null, new C6288l(13), 1);
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l adcel(InterfaceC14029l interfaceC14029l) {
        return new C15259l(this.f29852l, this.f29853l, this.f29851l, interfaceC14029l);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C15259l) adcel((InterfaceC14029l) obj)).Signature(Unit.INSTANCE);
    }
}
