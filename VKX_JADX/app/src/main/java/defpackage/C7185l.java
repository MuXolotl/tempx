package defpackage;

import bruhcollective.itaysonlab.libvkmusic.objects.UmaTrack;
import java.util.LinkedHashMap;
import kotlin.Unit;

/* JADX INFO: renamed from: lًُؚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7185l implements InterfaceC9198l {
    public final C13047l yandex = AbstractC9549l.yandex(new C12176l(5));

    public static C18010l mopub(C17467l c17467l, C17467l c17467l2, String str) {
        C8195l c8195l;
        C10685l c10685l = new C10685l(13);
        UmaTrack umaTrack = (UmaTrack) c17467l.yandex;
        InterfaceC3937l interfaceC3937l = (InterfaceC3937l) c17467l.loadAd;
        if (interfaceC3937l instanceof C16022l) {
            c8195l = new C8195l(((C16022l) interfaceC3937l).yandex.crashlytics(), "mix");
        } else {
            if (!(interfaceC3937l instanceof C13274l)) {
                C18725l.billing();
                return null;
            }
            c8195l = new C8195l("/share/file/" + umaTrack.yandex, "main");
        }
        AbstractC5833l.billing(c10685l, "activity_type", 1);
        AbstractC5833l.billing(c10685l, "add_action", 0);
        AbstractC5833l.mopub(c10685l, "app_state_start", "active");
        AbstractC5833l.mopub(c10685l, "app_state_end", "active");
        AbstractC5833l.billing(c10685l, "use_type", 0);
        AbstractC5833l.billing(c10685l, "volume", 20);
        AbstractC5833l.mopub(c10685l, "repeat", "off");
        AbstractC5833l.mopub(c10685l, "shuffle", "off");
        AbstractC5833l.billing(c10685l, "progress", Long.valueOf(c17467l.amazon));
        AbstractC5833l.mopub(c10685l, "end_stream_reason", str);
        AbstractC5833l.mopub(c10685l, "source_uri", (String) c8195l.f17098l);
        AbstractC5833l.mopub(c10685l, "source_client", (String) c8195l.f17097l);
        AbstractC5833l.mopub(c10685l, "file_id", umaTrack.yandex);
        AbstractC5833l.billing(c10685l, "client_time", Long.valueOf(c17467l2 != null ? c17467l2.crashlytics : c17467l.crashlytics));
        if (str.equals("unknown")) {
            AbstractC5833l.billing(c10685l, "client_stop_time", 0L);
        } else {
            AbstractC5833l.billing(c10685l, "client_stop_time", Long.valueOf(System.currentTimeMillis() / 1000));
        }
        if (c17467l2 != null) {
            C10507l c10507l = c17467l2.yandex;
        }
        return new C18010l((LinkedHashMap) c10685l.f21690l);
    }

    @Override // defpackage.InterfaceC9198l
    public final Object amazon(C17467l c17467l, InterfaceC14029l interfaceC14029l) {
        return Unit.INSTANCE;
    }

    @Override // defpackage.InterfaceC9198l
    public final Object billing(C17467l c17467l, C2323l c2323l) {
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00bf, code lost:
    
        if (r8.crashlytics(r0) == r6) goto L36;
     */
    @Override // defpackage.InterfaceC9198l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object crashlytics(defpackage.C17467l r8, defpackage.C17467l r9, defpackage.EnumC8098l r10, defpackage.InterfaceC14029l r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof defpackage.C16207l
            if (r0 == 0) goto L13
            r0 = r11
            lٖؗٙ r0 = (defpackage.C16207l) r0
            int r1 = r0.f31706l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31706l = r1
            goto L1a
        L13:
            lٖؗٙ r0 = new lٖؗٙ
            lّؑۧ r11 = (defpackage.AbstractC0283l) r11
            r0.<init>(r7, r11)
        L1a:
            java.lang.Object r11 = r0.f31709l
            int r1 = r0.f31706l
            lْؐۤ r2 = r7.yandex
            r3 = 2
            r4 = 1
            r5 = 0
            lٍؗؐ r6 = defpackage.EnumC9342l.f19165l
            if (r1 == 0) goto L3e
            if (r1 == r4) goto L36
            if (r1 != r3) goto L30
            defpackage.AbstractC2829l.crashlytics(r11)
            goto Lc2
        L30:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C8339l.smaato(r7)
            return r5
        L36:
            lُٗۡ r9 = r0.f31707l
            lُٗۡ r8 = r0.f31708l
            defpackage.AbstractC2829l.crashlytics(r11)
            goto L95
        L3e:
            defpackage.AbstractC2829l.crashlytics(r11)
            boolean r11 = r7.loadAd(r8)
            if (r11 == 0) goto L95
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            int r10 = r10.ordinal()
            r1 = 3
            if (r10 == 0) goto L66
            if (r10 == r4) goto L63
            if (r10 == r3) goto L60
            if (r10 != r1) goto L5c
            java.lang.String r10 = "playlist_change"
            goto L68
        L5c:
            defpackage.C18725l.billing()
            return r5
        L60:
            java.lang.String r10 = "completed"
            goto L68
        L63:
            java.lang.String r10 = "next_btn"
            goto L68
        L66:
            java.lang.String r10 = "previous_btn"
        L68:
            l٘ٙۥ r10 = mopub(r8, r5, r10)
            r11.add(r10)
            lَٛ r10 = new lَٛ
            r10.<init>(r11)
            r2.getClass()
            lؚۛٙ r11 = defpackage.C18427l.Companion
            lؘٖۘ r11 = r11.serializer()
            lؘٖۘ r11 = (defpackage.InterfaceC16588l) r11
            java.lang.String r10 = r2.crashlytics(r11, r10)
            lؒۦؗ r11 = new lؒۦؗ
            r11.<init>(r10, r1)
            r0.f31708l = r8
            r0.f31707l = r9
            r0.f31706l = r4
            java.lang.Object r10 = r11.crashlytics(r0)
            if (r10 != r6) goto L95
            goto Lc1
        L95:
            boolean r7 = r7.loadAd(r9)
            if (r7 == 0) goto Lc5
            java.lang.String r7 = "unknown"
            l٘ٙۥ r7 = mopub(r9, r8, r7)
            r2.getClass()
            lؘؒٝ r8 = defpackage.C18010l.Companion
            lؘٖۘ r8 = r8.serializer()
            lؘٖۘ r8 = (defpackage.InterfaceC16588l) r8
            java.lang.String r7 = r2.crashlytics(r8, r7)
            lؒۦؗ r8 = new lؒۦؗ
            r8.<init>(r7, r3)
            r0.f31708l = r5
            r0.f31707l = r5
            r0.f31706l = r3
            java.lang.Object r7 = r8.crashlytics(r0)
            if (r7 != r6) goto Lc2
        Lc1:
            return r6
        Lc2:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        Lc5:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7185l.crashlytics(lُٗۡ, lُٗۡ, lًٚ٘, lٌؚٓ):java.lang.Object");
    }

    @Override // defpackage.InterfaceC9198l
    public final boolean loadAd(C17467l c17467l) {
        if (!(c17467l.loadAd instanceof InterfaceC3937l)) {
            return false;
        }
        C10507l c10507l = c17467l.yandex;
        return false;
    }

    @Override // defpackage.InterfaceC9198l
    public final Object purchase(C17467l c17467l, C17467l c17467l2, EnumC8376l enumC8376l, InterfaceC14029l interfaceC14029l) {
        return Unit.INSTANCE;
    }

    @Override // defpackage.InterfaceC9198l
    public final Object yandex(C17467l c17467l, C15682l c15682l) {
        return Unit.INSTANCE;
    }
}
