package defpackage;

import android.util.Log;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؗٙۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4978l extends AbstractC5563l implements Function1 {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f10174l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ Object f10175l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4978l(Object obj, InterfaceC14029l interfaceC14029l, int i) {
        super(1, interfaceC14029l);
        this.f10174l = i;
        this.f10175l = obj;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) throws InterruptedException {
        int i = this.f10174l;
        Object obj2 = this.f10175l;
        switch (i) {
            case 0:
                AbstractC2829l.crashlytics(obj);
                C5616l.yandex((C5616l) obj2);
                return Unit.INSTANCE;
            case 1:
                AbstractC2829l.crashlytics(obj);
                Log.d("CXCP", "tryOpenCamera: Camera open cancelled");
                ((C10700l) obj2).f21708l = null;
                return new C10785l(null, new C6288l(13), 1);
            case 2:
                AbstractC2829l.crashlytics(obj);
                ((C15202l) obj2).pro.await();
                return Unit.INSTANCE;
            case 3:
                AbstractC2829l.crashlytics(obj);
                C0303l c0303l = (C0303l) AbstractC3483l.crashlytics(((C5374l) obj2).purchase, C0303l.Companion.serializer(), AbstractC16648l.ads(new byte[]{115, 112, 97, 114, 107, 46, 97, 117, 116, 104, 111, 114, 105, 122, 97, 116, 105, 111, 110}), AbstractC10651l.yandex);
                if (c0303l != null) {
                    return c0303l.yandex();
                }
                return null;
            default:
                AbstractC2829l.crashlytics(obj);
                ((C10304l) obj2).f20994l.Signature.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l adcel(InterfaceC14029l interfaceC14029l) {
        int i = this.f10174l;
        Object obj = this.f10175l;
        switch (i) {
            case 0:
                return new C4978l((C5616l) obj, interfaceC14029l, 0);
            case 1:
                return new C4978l((C10700l) obj, interfaceC14029l, 1);
            case 2:
                return new C4978l((C15202l) obj, interfaceC14029l, 2);
            case 3:
                return new C4978l((C5374l) obj, interfaceC14029l, 3);
            default:
                return new C4978l((C10304l) obj, interfaceC14029l, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj;
        switch (this.f10174l) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return ((C4978l) adcel(interfaceC14029l)).Signature(Unit.INSTANCE);
    }
}
