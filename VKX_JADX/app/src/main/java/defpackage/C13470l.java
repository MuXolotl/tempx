package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;
import kotlin.Unit;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;

/* JADX INFO: renamed from: lْٙۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13470l implements InterfaceC9198l {
    public InterfaceC7042l amazon;
    public final ArrayList billing;
    public final C18662l crashlytics;
    public final C13047l loadAd;
    public final C4910l purchase;
    public final /* synthetic */ int yandex;

    public C13470l(int i) {
        this.yandex = i;
        switch (i) {
            case 1:
                this.loadAd = AbstractC9549l.yandex(new C8578l(1));
                C18662l c18662lLoadAd = AbstractC11990l.loadAd();
                this.crashlytics = new C18662l(c18662lLoadAd.f36440l.mo246l(new C0499l("DelayedAnalyticsFacade-VKPodcasts")));
                this.purchase = AbstractC8618l.yandex();
                this.billing = new ArrayList();
                break;
            default:
                this.loadAd = AbstractC9549l.yandex(new C10949l(25));
                C18662l c18662lLoadAd2 = AbstractC11990l.loadAd();
                this.crashlytics = new C18662l(c18662lLoadAd2.f36440l.mo246l(new C0499l("DelayedAnalyticsFacade-VK")));
                this.purchase = AbstractC8618l.yandex();
                this.billing = new ArrayList();
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object admob(C13470l c13470l, ArrayList arrayList, AbstractC0283l abstractC0283l) {
        C3280l c3280l;
        Object c18435l;
        if (abstractC0283l instanceof C3280l) {
            c3280l = (C3280l) abstractC0283l;
            int i = c3280l.f7024l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c3280l.f7024l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c3280l = new C3280l(c13470l, abstractC0283l);
            }
        } else {
            c3280l = new C3280l(c13470l, abstractC0283l);
        }
        Object objBilling = c3280l.f7023l;
        int i2 = c3280l.f7024l;
        try {
            if (i2 == 0) {
                AbstractC2829l.crashlytics(objBilling);
                if (!arrayList.isEmpty()) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.addAll(arrayList);
                    C18427l c18427l = new C18427l(arrayList2);
                    C7644l c7644lLoadAd = AbstractC16584l.loadAd();
                    C13047l c13047l = c13470l.loadAd;
                    c13047l.getClass();
                    String strCrashlytics = c13047l.crashlytics(C18427l.Companion.serializer(), c18427l);
                    c3280l.f7024l = 1;
                    C17464l c17464l = new C17464l("stats.trackEvents", C6168l.f13004l);
                    c17464l.loadAd = true;
                    c17464l.yandex("events", strCrashlytics);
                    objBilling = c7644lLoadAd.billing(c17464l, c3280l);
                    EnumC9342l enumC9342l = EnumC9342l.f19165l;
                    if (objBilling == enumC9342l) {
                        return enumC9342l;
                    }
                }
                return Unit.INSTANCE;
            }
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC2829l.crashlytics(objBilling);
            c18435l = (AbstractC14237l) objBilling;
        } catch (Throwable th) {
            c18435l = new C18435l(th);
        }
        if (!(c18435l instanceof C18435l)) {
        }
        return Unit.INSTANCE;
    }

    public static C18010l firebase(C17467l c17467l, C17467l c17467l2, String str) {
        String str2;
        C10685l c10685l = new C10685l(13);
        LinkedHashMap linkedHashMap = (LinkedHashMap) c10685l.f21690l;
        AbstractC5833l.mopub(c10685l, "e", "podcast_play");
        C10507l c10507l = c17467l.yandex;
        AbstractC18643l abstractC18643l = c10507l != null ? c10507l.loadAd : null;
        AudioTrack audioTrack = abstractC18643l instanceof AudioTrack ? (AudioTrack) abstractC18643l : null;
        AbstractC5833l.mopub(c10685l, "audio_id", audioTrack != null ? AbstractC16676l.mopub(audioTrack) : null);
        AbstractC18643l abstractC18643l2 = c10507l != null ? c10507l.loadAd : null;
        AudioTrack audioTrack2 = abstractC18643l2 instanceof AudioTrack ? (AudioTrack) abstractC18643l2 : null;
        AbstractC5833l.billing(c10685l, "duration", Integer.valueOf(audioTrack2 != null ? audioTrack2.purchase : 0));
        AbstractC5833l.billing(c10685l, "play_rate", 1);
        Boolean bool = Boolean.FALSE;
        C11474l c11474l = AbstractC8358l.yandex;
        AbstractC5833l.mopub(c10685l, "action", str);
        long j = c17467l.amazon;
        AbstractC18643l abstractC18643l3 = c10507l != null ? c10507l.loadAd : null;
        AudioTrack audioTrack3 = abstractC18643l3 instanceof AudioTrack ? (AudioTrack) abstractC18643l3 : null;
        long j2 = audioTrack3 != null ? audioTrack3.purchase : 0L;
        if (j > j2) {
            j = j2;
        }
        AbstractC5833l.billing(c10685l, "position", Long.valueOf(j));
        if (c17467l2 != null && str.equals("seek")) {
            AbstractC5833l.billing(c10685l, "position_from", Long.valueOf(c17467l2.amazon));
        }
        AbstractC18643l abstractC18643l4 = c10507l != null ? c10507l.loadAd : null;
        AudioTrack audioTrack4 = abstractC18643l4 instanceof AudioTrack ? (AudioTrack) abstractC18643l4 : null;
        if (audioTrack4 != null && (str2 = audioTrack4.subs) != null) {
            String str3 = AbstractC12024l.m3315catch(str2) ? null : str2;
            if (str3 != null) {
                AbstractC5833l.mopub(c10685l, "track_code", str3);
            }
        }
        AbstractC5833l.mopub(c10685l, "ref", "episode");
        AbstractC5833l.mopub(c10685l, "source", "icon_button");
        return new C18010l(linkedHashMap);
    }

    public static String isPro(String str) {
        List listM3338public = AbstractC12024l.m3338public(str, new String[]{"_"}, 6);
        if (listM3338public.size() != 3) {
            listM3338public = null;
        }
        if (listM3338public == null) {
            return str;
        }
        return ((String) listM3338public.get(0)) + '_' + ((String) listM3338public.get(1));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object mopub(C13470l c13470l, ArrayList arrayList, AbstractC0283l abstractC0283l) {
        C16342l c16342l;
        Object c18435l;
        if (abstractC0283l instanceof C16342l) {
            c16342l = (C16342l) abstractC0283l;
            int i = c16342l.f31958l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c16342l.f31958l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c16342l = new C16342l(c13470l, abstractC0283l);
            }
        } else {
            c16342l = new C16342l(c13470l, abstractC0283l);
        }
        Object objBilling = c16342l.f31957l;
        int i2 = c16342l.f31958l;
        try {
            if (i2 == 0) {
                AbstractC2829l.crashlytics(objBilling);
                if (!arrayList.isEmpty()) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.addAll(arrayList);
                    C18427l c18427l = new C18427l(arrayList2);
                    C7644l c7644lLoadAd = AbstractC16584l.loadAd();
                    C13047l c13047l = c13470l.loadAd;
                    c13047l.getClass();
                    String strCrashlytics = c13047l.crashlytics(C18427l.Companion.serializer(), c18427l);
                    c16342l.f31958l = 1;
                    C17464l c17464l = new C17464l("stats.trackEvents", C6168l.f13004l);
                    c17464l.loadAd = true;
                    c17464l.yandex("events", strCrashlytics);
                    objBilling = c7644lLoadAd.billing(c17464l, c16342l);
                    EnumC9342l enumC9342l = EnumC9342l.f19165l;
                    if (objBilling == enumC9342l) {
                        return enumC9342l;
                    }
                }
                return Unit.INSTANCE;
            }
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC2829l.crashlytics(objBilling);
            c18435l = (AbstractC14237l) objBilling;
        } catch (Throwable th) {
            c18435l = new C18435l(th);
        }
        if (!(c18435l instanceof C18435l)) {
        }
        return Unit.INSTANCE;
    }

    public static C18010l smaato(String str, C17467l c17467l, C17467l c17467l2, String str2) {
        String str3;
        C10685l c10685l = new C10685l(13);
        LinkedHashMap linkedHashMap = (LinkedHashMap) c10685l.f21690l;
        AbstractC5833l.mopub(c10685l, "e", str);
        C10507l c10507l = c17467l.yandex;
        long j = c17467l.amazon;
        AbstractC18643l abstractC18643l = c10507l != null ? c10507l.loadAd : null;
        AudioTrack audioTrack = abstractC18643l instanceof AudioTrack ? (AudioTrack) abstractC18643l : null;
        AbstractC5833l.mopub(c10685l, "audio_id", audioTrack != null ? AbstractC16676l.mopub(audioTrack) : null);
        AbstractC5833l.billing(c10685l, "uuid", Integer.valueOf(UUID.randomUUID().hashCode()));
        Boolean bool = Boolean.FALSE;
        C11474l c11474l = AbstractC8358l.yandex;
        AbstractC5833l.mopub(c10685l, "reason", str2);
        AbstractC5833l.billing(c10685l, "start_time", Long.valueOf(c17467l.crashlytics));
        AbstractC5833l.billing(c10685l, "playback_started_at", Long.valueOf(j));
        AbstractC18643l abstractC18643l2 = c10507l != null ? c10507l.loadAd : null;
        AudioTrack audioTrack2 = abstractC18643l2 instanceof AudioTrack ? (AudioTrack) abstractC18643l2 : null;
        if (audioTrack2 != null && (str3 = audioTrack2.subs) != null) {
            if (AbstractC12024l.m3315catch(str3)) {
                str3 = null;
            }
            if (str3 != null) {
                AbstractC5833l.mopub(c10685l, "track_code", str3);
            }
        }
        AbstractC5833l.mopub(c10685l, "streaming_type", "online");
        AbstractC5833l.billing(c10685l, "duration", Long.valueOf(j));
        AbstractC5833l.mopub(c10685l, "repeat", "all");
        AbstractC5833l.mopub(c10685l, "state", "app");
        InterfaceC17817l interfaceC17817l = c17467l.loadAd;
        if (interfaceC17817l instanceof C7108l) {
            AbstractC5833l.mopub(c10685l, "source", ((C7108l) interfaceC17817l).purchase);
        } else if (interfaceC17817l instanceof C11827l) {
            AbstractC5833l.mopub(c10685l, "source", "other");
            AbstractC5833l.mopub(c10685l, "playlist_id", isPro(((C11827l) interfaceC17817l).purchase));
        } else {
            AbstractC5833l.mopub(c10685l, "source", "other");
        }
        if (c17467l2 != null) {
            C10507l c10507l2 = c17467l2.yandex;
            InterfaceC17817l interfaceC17817l2 = c17467l2.loadAd;
            if (interfaceC17817l2 instanceof C11827l) {
                AbstractC5833l.mopub(c10685l, "prev_playlist_id", isPro(((C11827l) interfaceC17817l2).purchase));
            }
            if (c10507l2 != null && !c10507l2.equals(c10507l)) {
                AbstractC18643l abstractC18643l3 = c10507l2.loadAd;
                AudioTrack audioTrack3 = abstractC18643l3 instanceof AudioTrack ? (AudioTrack) abstractC18643l3 : null;
                if (audioTrack3 != null) {
                    AbstractC5833l.mopub(c10685l, "prev_audio_id", AbstractC16676l.mopub(audioTrack3));
                }
            }
        }
        return new C18010l(linkedHashMap);
    }

    public static String subs(EnumC8098l enumC8098l) {
        int iOrdinal = enumC8098l.ordinal();
        if (iOrdinal == 0) {
            return "prev";
        }
        if (iOrdinal == 1 || iOrdinal == 2) {
            return "next";
        }
        if (iOrdinal == 3) {
            return "new";
        }
        C18725l.billing();
        return null;
    }

    @Override // defpackage.InterfaceC9198l
    public final Object amazon(C17467l c17467l, InterfaceC14029l interfaceC14029l) {
        int i = this.yandex;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        ArrayList arrayList = this.billing;
        switch (i) {
            case 0:
                arrayList.add(smaato("music_stop_playback", c17467l, null, "pause"));
                Object objRemoteconfig = remoteconfig((AbstractC0283l) interfaceC14029l);
                return objRemoteconfig == enumC9342l ? objRemoteconfig : Unit.INSTANCE;
            default:
                arrayList.add(firebase(c17467l, null, "pause"));
                Object objVip = vip((AbstractC0283l) interfaceC14029l);
                return objVip == enumC9342l ? objVip : Unit.INSTANCE;
        }
    }

    @Override // defpackage.InterfaceC9198l
    public final Object billing(C17467l c17467l, C2323l c2323l) {
        int i = this.yandex;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        ArrayList arrayList = this.billing;
        switch (i) {
            case 0:
                arrayList.add(smaato("music_start_playback", c17467l, null, "continue"));
                Object objRemoteconfig = remoteconfig(c2323l);
                return objRemoteconfig == enumC9342l ? objRemoteconfig : Unit.INSTANCE;
            default:
                arrayList.add(firebase(c17467l, null, "play"));
                Object objVip = vip(c2323l);
                return objVip == enumC9342l ? objVip : Unit.INSTANCE;
        }
    }

    @Override // defpackage.InterfaceC9198l
    public final Object crashlytics(C17467l c17467l, C17467l c17467l2, EnumC8098l enumC8098l, InterfaceC14029l interfaceC14029l) {
        int i = this.yandex;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        ArrayList arrayList = this.billing;
        switch (i) {
            case 0:
                if (loadAd(c17467l)) {
                    arrayList.add(smaato("music_stop_playback", c17467l, null, subs(enumC8098l)));
                }
                if (loadAd(c17467l2)) {
                    arrayList.add(smaato("music_start_playback", c17467l2, c17467l, subs(enumC8098l)));
                }
                Object objRemoteconfig = remoteconfig((AbstractC0283l) interfaceC14029l);
                return objRemoteconfig == enumC9342l ? objRemoteconfig : Unit.INSTANCE;
            default:
                if (loadAd(c17467l)) {
                    arrayList.add(firebase(c17467l, null, "heartbeat"));
                }
                if (loadAd(c17467l2)) {
                    arrayList.add(firebase(c17467l, c17467l, "play"));
                }
                Object objVip = vip((AbstractC0283l) interfaceC14029l);
                return objVip == enumC9342l ? objVip : Unit.INSTANCE;
        }
    }

    @Override // defpackage.InterfaceC9198l
    public final boolean loadAd(C17467l c17467l) {
        switch (this.yandex) {
            case 0:
                if (!(c17467l.loadAd instanceof InterfaceC8393l)) {
                    return false;
                }
                C10507l c10507l = c17467l.yandex;
                if (!((c10507l != null ? c10507l.loadAd : null) instanceof AudioTrack)) {
                    return false;
                }
                AudioTrack audioTrack = (AudioTrack) (c10507l != null ? c10507l.loadAd : null);
                audioTrack.getClass();
                return !AbstractC0653l.purchase(audioTrack);
            default:
                if (!(c17467l.loadAd instanceof C7839l)) {
                    return false;
                }
                C10507l c10507l2 = c17467l.yandex;
                if (!((c10507l2 != null ? c10507l2.loadAd : null) instanceof AudioTrack)) {
                    return false;
                }
                AudioTrack audioTrack2 = (AudioTrack) (c10507l2 != null ? c10507l2.loadAd : null);
                audioTrack2.getClass();
                return AbstractC0653l.purchase(audioTrack2);
        }
    }

    @Override // defpackage.InterfaceC9198l
    public final Object purchase(C17467l c17467l, C17467l c17467l2, EnumC8376l enumC8376l, InterfaceC14029l interfaceC14029l) {
        String str;
        switch (this.yandex) {
            case 0:
                return Unit.INSTANCE;
            default:
                int iOrdinal = enumC8376l.ordinal();
                if (iOrdinal == 0) {
                    str = "seek";
                } else {
                    if (iOrdinal != 1) {
                        C18725l.billing();
                        return null;
                    }
                    str = "heartbeat";
                }
                this.billing.add(firebase(c17467l2, c17467l, str));
                Object objVip = vip((AbstractC0283l) interfaceC14029l);
                return objVip == EnumC9342l.f19165l ? objVip : Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0087, code lost:
    
        if (r2.yandex(r0) == r6) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object remoteconfig(defpackage.AbstractC0283l r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.C0214l
            if (r0 == 0) goto L13
            r0 = r9
            lٍؑٙ r0 = (defpackage.C0214l) r0
            int r1 = r0.f1187l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1187l = r1
            goto L18
        L13:
            lٍؑٙ r0 = new lٍؑٙ
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f1183l
            int r1 = r0.f1187l
            lٖؗؓ r2 = r8.purchase
            r3 = 2
            r4 = 1
            r5 = 0
            lٍؗؐ r6 = defpackage.EnumC9342l.f19165l
            if (r1 == 0) goto L43
            if (r1 == r4) goto L3b
            if (r1 != r3) goto L35
            lٖؗؓ r2 = r0.f1188l
            lؚٜۚ r1 = r0.f1185l
            java.lang.Object r0 = r0.f1186l
            lٌؚؖ r0 = (defpackage.InterfaceC7042l) r0
            defpackage.AbstractC2829l.crashlytics(r9)
            goto L8a
        L35:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C8339l.smaato(r8)
            return r5
        L3b:
            java.lang.Object r1 = r0.f1186l
            lٍؓؕ r1 = (defpackage.InterfaceC1601l) r1
            defpackage.AbstractC2829l.crashlytics(r9)
            goto L52
        L43:
            defpackage.AbstractC2829l.crashlytics(r9)
            r0.f1186l = r2
            r0.f1187l = r4
            java.lang.Object r9 = r2.yandex(r0)
            if (r9 != r6) goto L51
            goto L89
        L51:
            r1 = r2
        L52:
            lٌؚؖ r9 = r8.amazon     // Catch: java.lang.Throwable -> L5a
            if (r9 == 0) goto L5c
            r9.ads(r5)     // Catch: java.lang.Throwable -> L5a
            goto L5c
        L5a:
            r8 = move-exception
            goto L99
        L5c:
            r8.amazon = r5     // Catch: java.lang.Throwable -> L5a
            kotlin.Unit r9 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L5a
            r1.billing(r5)
            lًٕٛ r9 = new lًٕٛ
            r1 = 4
            r9.<init>(r8, r5, r1)
            r1 = 3
            r4 = 0
            lۣۛ r7 = r8.crashlytics
            lؚٜۚ r1 = defpackage.AbstractC10999l.mopub(r7, r5, r4, r9, r1)
            lًؒؒ r9 = new lًؒؒ
            r4 = 25
            r9.<init>(r4, r8)
            r1.mo2154l(r9)
            r0.f1186l = r1
            r0.f1185l = r1
            r0.f1188l = r2
            r0.f1187l = r3
            java.lang.Object r9 = r2.yandex(r0)
            if (r9 != r6) goto L8a
        L89:
            return r6
        L8a:
            r8.amazon = r1     // Catch: java.lang.Throwable -> L94
            kotlin.Unit r8 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L94
            r2.billing(r5)
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        L94:
            r8 = move-exception
            r2.billing(r5)
            throw r8
        L99:
            r1.billing(r5)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C13470l.remoteconfig(lّؑۧ):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0088, code lost:
    
        if (r2.yandex(r0) == r6) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object vip(defpackage.AbstractC0283l r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.C7756l
            if (r0 == 0) goto L13
            r0 = r9
            lًؔٓ r0 = (defpackage.C7756l) r0
            int r1 = r0.f16272l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16272l = r1
            goto L18
        L13:
            lًؔٓ r0 = new lًؔٓ
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f16268l
            int r1 = r0.f16272l
            lٖؗؓ r2 = r8.purchase
            r3 = 2
            r4 = 1
            r5 = 0
            lٍؗؐ r6 = defpackage.EnumC9342l.f19165l
            if (r1 == 0) goto L43
            if (r1 == r4) goto L3b
            if (r1 != r3) goto L35
            lٖؗؓ r2 = r0.f16273l
            lؚٜۚ r1 = r0.f16270l
            java.lang.Object r0 = r0.f16271l
            lٌؚؖ r0 = (defpackage.InterfaceC7042l) r0
            defpackage.AbstractC2829l.crashlytics(r9)
            goto L8b
        L35:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C8339l.smaato(r8)
            return r5
        L3b:
            java.lang.Object r1 = r0.f16271l
            lٍؓؕ r1 = (defpackage.InterfaceC1601l) r1
            defpackage.AbstractC2829l.crashlytics(r9)
            goto L52
        L43:
            defpackage.AbstractC2829l.crashlytics(r9)
            r0.f16271l = r2
            r0.f16272l = r4
            java.lang.Object r9 = r2.yandex(r0)
            if (r9 != r6) goto L51
            goto L8a
        L51:
            r1 = r2
        L52:
            lٌؚؖ r9 = r8.amazon     // Catch: java.lang.Throwable -> L5a
            if (r9 == 0) goto L5c
            r9.ads(r5)     // Catch: java.lang.Throwable -> L5a
            goto L5c
        L5a:
            r8 = move-exception
            goto L9a
        L5c:
            r8.amazon = r5     // Catch: java.lang.Throwable -> L5a
            kotlin.Unit r9 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L5a
            r1.billing(r5)
            lًٕٛ r9 = new lًٕٛ
            r1 = 11
            r9.<init>(r8, r5, r1)
            r1 = 3
            r4 = 0
            lۣۛ r7 = r8.crashlytics
            lؚٜۚ r1 = defpackage.AbstractC10999l.mopub(r7, r5, r4, r9, r1)
            lًؒؒ r9 = new lًؒؒ
            r4 = 26
            r9.<init>(r4, r8)
            r1.mo2154l(r9)
            r0.f16271l = r1
            r0.f16270l = r1
            r0.f16273l = r2
            r0.f16272l = r3
            java.lang.Object r9 = r2.yandex(r0)
            if (r9 != r6) goto L8b
        L8a:
            return r6
        L8b:
            r8.amazon = r1     // Catch: java.lang.Throwable -> L95
            kotlin.Unit r8 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L95
            r2.billing(r5)
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        L95:
            r8 = move-exception
            r2.billing(r5)
            throw r8
        L9a:
            r1.billing(r5)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C13470l.vip(lّؑۧ):java.lang.Object");
    }

    @Override // defpackage.InterfaceC9198l
    public final Object yandex(C17467l c17467l, C15682l c15682l) {
        switch (this.yandex) {
            case 0:
                if (!(c17467l.loadAd instanceof C11827l)) {
                    return Unit.INSTANCE;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                this.billing.add(new C18010l(linkedHashMap));
                Object objRemoteconfig = remoteconfig(c15682l);
                return objRemoteconfig == EnumC9342l.f19165l ? objRemoteconfig : Unit.INSTANCE;
            default:
                return Unit.INSTANCE;
        }
    }
}
