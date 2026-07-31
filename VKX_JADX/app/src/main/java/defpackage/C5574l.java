package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkapi2.objects.music.playlist.metadata.OriginalPlaylist;

/* JADX INFO: renamed from: lٍؘٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5574l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f11849l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ C17398l f11850l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5574l(C17398l c17398l, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f11849l = i;
        this.f11850l = c17398l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f11849l;
        C17398l c17398l = this.f11850l;
        switch (i) {
            case 0:
                AbstractC2829l.crashlytics(obj);
                c17398l.mo782this();
                break;
            case 1:
                AbstractC2829l.crashlytics(obj);
                AbstractC11708l.yandex(new C15245l(0, c17398l.isVip(), "Плейлист удален"));
                OriginalPlaylist originalPlaylist = c17398l.f33899l.tapsense;
                if (originalPlaylist != null) {
                    c17398l.f33900l = originalPlaylist.loadAd;
                    c17398l.f33885l = originalPlaylist.yandex;
                    c17398l.f33901l = originalPlaylist.crashlytics;
                    c17398l.mo782this();
                } else {
                    c17398l.mo1143default();
                }
                break;
            default:
                AbstractC2829l.crashlytics(obj);
                c17398l.mo782this();
                break;
        }
        return Unit.INSTANCE;
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        int i = this.f11849l;
        C17398l c17398l = this.f11850l;
        switch (i) {
            case 0:
                return new C5574l(c17398l, interfaceC14029l, 0);
            case 1:
                return new C5574l(c17398l, interfaceC14029l, 1);
            default:
                return new C5574l(c17398l, interfaceC14029l, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj2;
        switch (this.f11849l) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((C5574l) ads(interfaceC14029l, interfaceC2262l)).Signature(Unit.INSTANCE);
    }
}
