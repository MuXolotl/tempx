package defpackage;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkxreborn.playback.service.PlaybackService;

/* JADX INFO: renamed from: lٍؖؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9329l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f19148l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ PlaybackService f19149l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9329l(PlaybackService playbackService, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f19148l = i;
        this.f19149l = playbackService;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f19148l;
        PlaybackService playbackService = this.f19149l;
        switch (i) {
            case 0:
                AbstractC2829l.crashlytics(obj);
                C10507l c10507lCrashlytics = PlaybackService.license().crashlytics();
                Object obj2 = c10507lCrashlytics != null ? c10507lCrashlytics.loadAd : null;
                InterfaceC9764l interfaceC9764l = obj2 instanceof InterfaceC9764l ? (InterfaceC9764l) obj2 : null;
                playbackService.signatures(interfaceC9764l != null ? Boolean.valueOf(interfaceC9764l.getBilling()) : null);
                break;
            default:
                AbstractC2829l.crashlytics(obj);
                Iterator it = AbstractC8669l.m2420volatile(playbackService.f36834l).iterator();
                while (it.hasNext()) {
                    ((C15926l) it.next()).crashlytics();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        int i = this.f19148l;
        PlaybackService playbackService = this.f19149l;
        switch (i) {
            case 0:
                return new C9329l(playbackService, interfaceC14029l, 0);
            default:
                return new C9329l(playbackService, interfaceC14029l, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f19148l) {
            case 0:
                return ((C9329l) ads((InterfaceC14029l) obj2, (C15200l) obj)).Signature(Unit.INSTANCE);
            default:
                return ((C9329l) ads((InterfaceC14029l) obj2, (C2807l) obj)).Signature(Unit.INSTANCE);
        }
    }
}
