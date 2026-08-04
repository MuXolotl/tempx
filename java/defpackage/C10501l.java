package defpackage;

import android.content.ContentResolver;
import android.provider.Settings;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lَۖۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C10501l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f21370l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ C18572l f21371l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10501l(C18572l c18572l, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f21370l = i;
        this.f21371l = c18572l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f21370l;
        C18572l c18572l = this.f21371l;
        switch (i) {
            case 0:
                AbstractC2829l.crashlytics(obj);
                ContentResolver contentResolver = c18572l.f36258l;
                contentResolver.registerContentObserver(Settings.System.getUriFor("reduce_animations"), false, c18572l.f36262l);
                boolean z = Settings.System.getInt(contentResolver, "reduce_animations", 0) == 0;
                if (c18572l.f36260l != null) {
                    C16552l c16552l = AbstractC11463l.yandex;
                    AbstractC10999l.mopub(AbstractC11990l.yandex(AbstractC17278l.yandex), null, 0, new C14047l(c18572l, z, null, 2), 3);
                }
                break;
            default:
                AbstractC2829l.crashlytics(obj);
                c18572l.f36258l.unregisterContentObserver(c18572l.f36262l);
                if (c18572l.f36260l != null) {
                    C16552l c16552l2 = AbstractC11463l.yandex;
                    AbstractC10999l.mopub(AbstractC11990l.yandex(AbstractC17278l.yandex), null, 0, new C14047l(c18572l, false, null, 2), 3);
                }
                break;
        }
        return Unit.INSTANCE;
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        int i = this.f21370l;
        C18572l c18572l = this.f21371l;
        switch (i) {
            case 0:
                return new C10501l(c18572l, interfaceC14029l, 0);
            default:
                return new C10501l(c18572l, interfaceC14029l, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj2;
        switch (this.f21370l) {
            case 0:
                break;
        }
        return ((C10501l) ads(interfaceC14029l, interfaceC2262l)).Signature(Unit.INSTANCE);
    }
}
