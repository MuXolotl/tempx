package defpackage;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist;
import ua.itaysonlab.vkapi2.objects.music.playlist.metadata.MainArtist;
import ua.itaysonlab.vkx.activity.AppActivity;

/* JADX INFO: renamed from: lۣٜ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18306l extends AbstractC10581l {

    /* JADX INFO: renamed from: lِؒؗ, reason: contains not printable characters */
    public final C10086l f35795l;

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public final int f35796l;

    /* JADX INFO: renamed from: lُؗٝ, reason: contains not printable characters */
    public final boolean f35797l;

    /* JADX INFO: renamed from: lؙۛۨ, reason: contains not printable characters */
    public final C10086l f35798l;

    /* JADX INFO: renamed from: lؚؕؖ, reason: contains not printable characters */
    public final C10086l f35799l;

    /* JADX INFO: renamed from: lٌؒٝ, reason: contains not printable characters */
    public final C4910l f35800l;

    /* JADX INFO: renamed from: lْؕٙ, reason: contains not printable characters */
    public final ArrayList f35801l;

    /* JADX INFO: renamed from: lْؗۚ, reason: contains not printable characters */
    public final C10086l f35802l;

    /* JADX INFO: renamed from: lْ٘ۗ, reason: contains not printable characters */
    public final C10086l f35803l;

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public final long f35804l;

    /* JADX WARN: Failed to calculate best type for var: r12v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v0 ??, new type: java.lang.String
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r12v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v0 ??, new type: java.lang.String
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r12v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v1 ??, new type: java.lang.String
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r12v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v3 ??, new type: java.lang.String
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r12v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v4 ??, new type: java.lang.String
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r12v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v5 ??, new type: java.lang.String
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r12v8 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v8 ??, new type: java.lang.String
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v5 ??, new type: java.lang.String
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r8v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v4 ??, new type: android.content.Context
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r8v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v5 ??, new type: android.content.Context
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r9v10 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v10 ??, new type: ua.itaysonlab.vkx.VKXApplication
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r9v11 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v11 ??, new type: android.content.Context
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r9v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v12 ??, new type: ua.itaysonlab.vkx.VKXApplication
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r9v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v2 ??, new type: ua.itaysonlab.vkx.VKXApplication
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v0 ??, new type: java.lang.CharSequence
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderAllow(TypeUpdate.java:66)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryWiderObjects(FixTypesVisitor.java:795)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:249)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    public C18306l(ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist r19, ua.itaysonlab.vkapi2.objects.users.VKProfile r20) {
        /*
            Method dump skipped, instruction units count: 300
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C18306l.<init>(ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist, ua.itaysonlab.vkapi2.objects.users.VKProfile):void");
    }

    /* JADX INFO: renamed from: lؚۦ۠, reason: contains not printable characters */
    public static void m4507l(int i, C18306l c18306l, AudioTrack audioTrack, boolean z) {
        InterfaceC17817l c11827l;
        if ((i & 1) != 0) {
            audioTrack = null;
        }
        boolean z2 = false;
        boolean z3 = (i & 2) != 0 ? false : z;
        AudioPlaylist audioPlaylistM4514l = c18306l.m4514l();
        if (audioPlaylistM4514l != null) {
            int iSmaato = audioPlaylistM4514l.smaato();
            if (audioPlaylistM4514l.f36622synchronized || (iSmaato != 5 && iSmaato != 4)) {
                z2 = true;
            }
        }
        InterfaceC3687l interfaceC3687lM4515l = c18306l.m4515l();
        C12708l c12708l = interfaceC3687lM4515l instanceof C12708l ? (C12708l) interfaceC3687lM4515l : null;
        String str = c12708l != null ? c12708l.yandex.mopub : null;
        if (str == null) {
            str = "";
        }
        if (z2) {
            AudioPlaylist audioPlaylistM4514l2 = c18306l.m4514l();
            String strVip = audioPlaylistM4514l2 != null ? AbstractC14770l.vip(audioPlaylistM4514l2) : null;
            c11827l = new C4134l(strVip != null ? strVip : "", str);
        } else {
            AudioPlaylist audioPlaylistM4514l3 = c18306l.m4514l();
            String strVip2 = audioPlaylistM4514l3 != null ? AbstractC14770l.vip(audioPlaylistM4514l3) : null;
            c11827l = new C11827l(strVip2 != null ? strVip2 : "", str);
        }
        AppActivity appActivity = (AppActivity) c18306l.isVip();
        String strBilling = audioTrack != null ? AbstractC16676l.billing(audioTrack) : null;
        AbstractC9092l.crashlytics(appActivity, c11827l, new C13305l(strBilling != null ? new C11392l(strBilling) : C4618l.yandex, 0L, c18306l.f35801l, false, true, z3, 74));
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0056  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX INFO: renamed from: l٘ٚۥ, reason: contains not printable characters */
    public static final Object m4508l(C18306l c18306l, AbstractC0283l abstractC0283l) {
        C9445l c9445l;
        boolean z;
        ArrayList arrayList;
        ArrayList arrayList2;
        Integer num;
        int iIntValue;
        C10086l c10086l = c18306l.f35799l;
        long j = c18306l.f35804l;
        int i = c18306l.f35796l;
        ArrayList<AudioTrack> arrayList3 = c18306l.f35801l;
        if (abstractC0283l instanceof C9445l) {
            c9445l = (C9445l) abstractC0283l;
            int i2 = c9445l.f19307l;
            if ((i2 & RecyclerView.UNDEFINED_DURATION) != 0) {
                c9445l.f19307l = i2 - RecyclerView.UNDEFINED_DURATION;
            } else {
                c9445l = new C9445l(c18306l, abstractC0283l);
            }
        } else {
            c9445l = new C9445l(c18306l, abstractC0283l);
        }
        Object objTapsense = c9445l.f19308l;
        int i3 = c9445l.f19307l;
        if (i3 == 0) {
            AbstractC2829l.crashlytics(objTapsense);
            if (c18306l.f35797l) {
                z = true;
            } else {
                AudioPlaylist audioPlaylistM4514l = c18306l.m4514l();
                if (audioPlaylistM4514l != null) {
                    int iSmaato = audioPlaylistM4514l.smaato();
                    if (audioPlaylistM4514l.f36622synchronized || (iSmaato != 5 && iSmaato != 4)) {
                        z = true;
                    }
                }
                z = false;
            }
            AbstractC2991l.billing(AbstractC17265l.yandex(c18306l), 5, "[loadPlaylistMetadata] offline: " + z + " / id: " + i + " / owner: " + j, null);
            if (z) {
                c9445l.f19309l = arrayList3;
                c9445l.f19307l = 1;
                objTapsense = C11485l.f23075l.tapsense(i, j, 0, 0, c9445l);
                Object obj = EnumC9342l.f19165l;
                if (objTapsense == obj) {
                    return obj;
                }
                arrayList = arrayList3;
            }
            arrayList2 = new ArrayList();
            int i4 = 0;
            for (AudioTrack audioTrack : arrayList3) {
                num = audioTrack.tapsense;
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 0;
                }
                if (iIntValue == 0 && i4 != iIntValue) {
                    arrayList2.add(new C8747l(String.valueOf(iIntValue)));
                    i4 = iIntValue;
                }
                arrayList2.add(new C15517l(audioTrack));
            }
            c10086l.setValue(((AbstractC18082l) c10086l.getValue()).advert(arrayList2));
            return Unit.INSTANCE;
        }
        if (i3 != 1) {
            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        arrayList = c9445l.f19309l;
        AbstractC2829l.crashlytics(objTapsense);
        arrayList.addAll((Collection) objTapsense);
        arrayList2 = new ArrayList();
        int i5 = 0;
        while (r13.hasNext()) {
            num = audioTrack.tapsense;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
            }
            arrayList2.add(new C15517l(audioTrack));
        }
        c10086l.setValue(((AbstractC18082l) c10086l.getValue()).advert(arrayList2));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: break, reason: not valid java name */
    public final void m4509break(InterfaceC3509l interfaceC3509l, C6956l c6956l, int i) {
        C18306l c18306l;
        C6956l c6956l2;
        c6956l.m2133new(-1185939548);
        int i2 = (c6956l.billing(interfaceC3509l) ? 4 : 2) | i | (c6956l.admob(this) ? 32 : 16);
        if (!c6956l.m2127for(i2 & 1, (i2 & 19) != 18)) {
            c18306l = this;
            c6956l2 = c6956l;
            c6956l2.m2124else();
        } else if (interfaceC3509l instanceof C7070l) {
            c6956l.m2123default(76074480);
            c18306l = this;
            c6956l2 = c6956l;
            c18306l.m4511finally(((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.adcel, (C7070l) interfaceC3509l, c6956l2, (i2 << 3) & 896);
            c6956l2.startapp(false);
        } else {
            c18306l = this;
            c6956l2 = c6956l;
            if (interfaceC3509l instanceof C10378l) {
                c6956l2.m2123default(76230720);
                c18306l.m4518return((C10378l) interfaceC3509l, c6956l2, i2 & 112);
                c6956l2.startapp(false);
            } else {
                if (!interfaceC3509l.equals(C17334l.f33651l)) {
                    throw AbstractC12900l.billing(-1521568501, c6956l2, false);
                }
                c6956l2.m2123default(76336430);
                c6956l2.startapp(false);
            }
        }
        C4224l c4224lAds = c6956l2.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C3158l(c18306l, interfaceC3509l, i, 21);
        }
    }

    /* JADX INFO: renamed from: const, reason: not valid java name */
    public final void m4510const(AudioTrack audioTrack, boolean z, int i, C6956l c6956l, int i2) {
        c6956l.m2133new(-1341959625);
        int i3 = i2 | (c6956l.billing(audioTrack) ? 4 : 2) | (c6956l.mopub(z) ? 32 : 16) | (c6956l.amazon(i) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | (c6956l.admob(this) ? 2048 : 1024);
        int i4 = 0;
        int i5 = 1;
        if (c6956l.m2127for(i3 & 1, (i3 & 1171) != 1170)) {
            int i6 = i3 & 14;
            boolean zAdmob = (i6 == 4) | c6956l.admob(this);
            Object objM2132native = c6956l.m2132native();
            C13863l c13863l = C1867l.yandex;
            if (zAdmob || objM2132native == c13863l) {
                objM2132native = new C13931l(audioTrack, this);
                c6956l.m2147try(objM2132native);
            }
            Function0 function0 = (Function0) objM2132native;
            boolean zAdmob2 = (i6 == 4) | c6956l.admob(this);
            Object objM2132native2 = c6956l.m2132native();
            if (zAdmob2 || objM2132native2 == c13863l) {
                objM2132native2 = new C13931l(this, audioTrack);
                c6956l.m2147try(objM2132native2);
            }
            AbstractC0133l.amazon(AbstractC14566l.amazon(-212488983, new C12106l(i, this, audioTrack, z), c6956l), AbstractC14566l.amazon(-1908512342, new C13178l(audioTrack, i4), c6956l), AbstractC3605l.remoteconfig(AbstractC0080l.amazon(AbstractC9151l.amazon(C4346l.f8873l, null, function0, null, (Function0) objM2132native2, 239), 1.0f), 16.0f, 4.0f), AbstractC14566l.amazon(-1005591764, new C13178l(audioTrack, i5), c6956l), c6956l, 3126, 0);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C9607l(this, audioTrack, z, i, i2);
        }
    }

    /* JADX INFO: renamed from: finally, reason: not valid java name */
    public final void m4511finally(long j, C7070l c7070l, C6956l c6956l, int i) {
        C6956l c6956l2 = c6956l;
        c6956l2.m2133new(1873064375);
        long j2 = j;
        int i2 = (i & 6) == 0 ? (c6956l2.purchase(j2) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= c6956l2.billing(c7070l) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c6956l2.admob(this) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        boolean z = false;
        if (c6956l2.m2127for(i2 & 1, (i2 & 147) != 146)) {
            boolean z2 = (i2 & 112) == 32;
            Object objM2132native = c6956l2.m2132native();
            if (z2 || objM2132native == C1867l.yandex) {
                List list = c7070l.f14816l;
                C8250l c8250l = new C8250l(14, this);
                C18734l c18734l = new C18734l();
                int i3 = 0;
                for (Object obj : list) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        AbstractC14055l.subscription();
                        throw null;
                    }
                    MainArtist mainArtist = (MainArtist) obj;
                    String str = mainArtist.yandex;
                    if (str == null) {
                        str = "";
                    }
                    C8250l c8250l2 = c8250l;
                    C18734l c18734l2 = c18734l;
                    int i5 = i3;
                    List list2 = list;
                    C4253l c4253l = new C4253l(new C7409l("LF/Artist/".concat(str), new C11244l(new C14264l(j2, 0L, C6886l.f14420l, null, null, null, null, 0L, null, null, null, 0L, null, null, 65530), null, null, null), new C15263l(c8250l2, mainArtist, 13)), c18734l2.f36518l.length(), 0, 12);
                    ArrayList arrayList = c18734l2.f36517l;
                    arrayList.add(c4253l);
                    c18734l2.f36516l.add(c4253l);
                    int size = arrayList.size() - 1;
                    try {
                        c18734l2.crashlytics(mainArtist.crashlytics);
                        Unit unit = Unit.INSTANCE;
                        c18734l2.amazon(size);
                        if (i5 != AbstractC14055l.smaato(list2)) {
                            c18734l2.crashlytics(" • ");
                        }
                        c8250l = c8250l2;
                        c18734l = c18734l2;
                        z = false;
                        i3 = i4;
                        list = list2;
                        j2 = j;
                    } catch (Throwable th) {
                        c18734l2.amazon(size);
                        throw th;
                    }
                }
                objM2132native = c18734l.billing();
                c6956l2 = c6956l;
                c6956l2.m2147try(objM2132native);
            }
            C10707l c10707l = AbstractC16964l.yandex;
            AbstractC13010l.crashlytics((C3625l) objM2132native, AbstractC0080l.amazon(C4346l.f8873l, 1.0f), 0L, 0L, null, null, null, 0L, new C10258l(3), 0L, 0, false, 0, 0, null, null, C11090l.yandex(((C14370l) c6956l2.isPro(c10707l)).loadAd.firebase, ((C14370l) c6956l2.isPro(c10707l)).yandex.subscription, 0L, null, null, 0L, 0L, null, null, 16777214), c6956l2, 48, 0, 261116);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C17027l(this, j, c7070l, i);
        }
    }

    /* JADX INFO: renamed from: implements, reason: not valid java name */
    public final void m4512implements(C6956l c6956l, int i) {
        c6956l.m2133new(1420809827);
        int i2 = 4;
        int i3 = i | (c6956l.admob(this) ? 4 : 2);
        int i4 = 0;
        if (c6956l.m2127for(i3 & 1, (i3 & 3) != 2)) {
            boolean zBooleanValue = ((Boolean) this.f35803l.getValue()).booleanValue();
            boolean zAdmob = c6956l.admob(this);
            Object objM2132native = c6956l.m2132native();
            if (zAdmob || objM2132native == C1867l.yandex) {
                objM2132native = new C12478l(this, i2);
                c6956l.m2147try(objM2132native);
            }
            AbstractC16727l.yandex(zBooleanValue, (Function0) objM2132native, null, 0L, null, null, null, 0L, 0.0f, AbstractC14566l.amazon(2082269064, new C2600l(this, i4), c6956l), c6956l, 0, 2044);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C12764l(this, i, 2);
        }
    }

    /* JADX INFO: renamed from: lؔٙؕ, reason: contains not printable characters */
    public final void m4513l(boolean z) {
        this.f35803l.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: lَٖؔ, reason: contains not printable characters */
    public final AudioPlaylist m4514l() {
        InterfaceC3687l interfaceC3687lM4515l = m4515l();
        C12708l c12708l = interfaceC3687lM4515l instanceof C12708l ? (C12708l) interfaceC3687lM4515l : null;
        if (c12708l != null) {
            return c12708l.yandex;
        }
        return null;
    }

    /* JADX INFO: renamed from: lؙٗٙ, reason: contains not printable characters */
    public final InterfaceC3687l m4515l() {
        return (InterfaceC3687l) this.f35795l.getValue();
    }

    @Override // defpackage.AbstractC11801l
    /* JADX INFO: renamed from: new */
    public final void mo271new(C6956l c6956l, int i) {
        c6956l.m2133new(-810107519);
        int i2 = i | (c6956l.admob(this) ? 4 : 2);
        if (c6956l.m2127for(i2 & 1, (i2 & 3) != 2)) {
            C2663l c2663lPurchase = AbstractC0831l.purchase(c6956l);
            if (((Boolean) this.f35798l.getValue()).booleanValue()) {
                c6956l.m2123default(-491628594);
                m4519this(c6956l, i2 & 14);
            } else {
                c6956l.m2123default(-505199743);
            }
            c6956l.startapp(false);
            InterfaceC3687l interfaceC3687lM4515l = m4515l();
            if (AbstractC8576l.yandex(interfaceC3687lM4515l, C16448l.yandex)) {
                c6956l.m2123default(-491484816);
                AbstractC7209l.yandex(AbstractC0080l.crashlytics(C4346l.f8873l, 1.0f), true, 0L, c6956l, 54, 4);
                c6956l.startapp(false);
            } else {
                if (!(interfaceC3687lM4515l instanceof C12708l)) {
                    throw AbstractC12900l.billing(-1124230460, c6956l, false);
                }
                c6956l.m2123default(-491172677);
                C12708l c12708l = (C12708l) interfaceC3687lM4515l;
                AbstractC15497l.loadAd(null, AbstractC14566l.amazon(773405030, new C12755l(c2663lPurchase, c12708l, this, 27), c6956l), null, null, null, 0, 0L, 0L, null, AbstractC14566l.amazon(1965899697, new Cprotected(c2663lPurchase, this, c12708l, 26), c6956l), c6956l, 805306416, 509);
                c6956l.startapp(false);
            }
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C12764l(this, i, 3);
        }
    }

    /* JADX INFO: renamed from: protected, reason: not valid java name */
    public final void m4516protected(String str, String str2, C15578l c15578l, C15578l c15578l2, C6956l c6956l, int i) {
        int i2;
        String str3;
        Function2 function2;
        C6956l c6956l2;
        Function2 function3;
        C15578l c15578l3 = c15578l2;
        C6956l c6956l3 = c6956l;
        c6956l3.m2133new(1642259257);
        int i3 = i & 6;
        C16170l c16170l = C16170l.yandex;
        if (i3 == 0) {
            i2 = (c6956l3.billing(c16170l) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            str3 = str;
            i2 |= c6956l3.billing(str3) ? 32 : 16;
        } else {
            str3 = str;
        }
        if ((i & 384) == 0) {
            i2 |= c6956l3.billing(str2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= c6956l3.admob(c15578l) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= c6956l3.admob(c15578l3) ? 16384 : 8192;
        }
        if (c6956l3.m2127for(i2 & 1, (i2 & 9363) != 9362)) {
            C14855l c14855l = C18450l.f36021l;
            C4346l c4346l = C4346l.f8873l;
            InterfaceC17242l interfaceC17242lVip = AbstractC3605l.vip(c16170l.yandex(c4346l, c14855l), 16.0f, 0.0f, 2);
            C1853l c1853lYandex = AbstractC1001l.yandex(new C7537l(16.0f, true, new C8339l(12)), C18450l.f36034l, c6956l3, 54);
            long j = c6956l3.f14595continue;
            int i4 = (int) (j ^ (j >>> 32));
            InterfaceC18556l interfaceC18556lSmaato = c6956l3.smaato();
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l3, interfaceC17242lVip);
            InterfaceC8801l.firebase.getClass();
            C16395l c16395l = C3438l.loadAd;
            c6956l3.m2140super();
            if (c6956l3.f14603switch) {
                c6956l3.firebase(c16395l);
            } else {
                c6956l3.m2136protected();
            }
            C6415l c6415l = C3438l.mopub;
            AbstractC8182l.billing(c6956l3, c1853lYandex, c6415l);
            C6415l c6415l2 = C3438l.billing;
            AbstractC8182l.billing(c6956l3, interfaceC18556lSmaato, c6415l2);
            Integer numValueOf = Integer.valueOf(i4);
            C6415l c6415l3 = C3438l.isPro;
            AbstractC8182l.billing(c6956l3, numValueOf, c6415l3);
            C11192l c11192l = C3438l.firebase;
            AbstractC8182l.purchase(c6956l3, c11192l);
            C6415l c6415l4 = C3438l.amazon;
            AbstractC8182l.billing(c6956l3, interfaceC17242lBilling, c6415l4);
            AbstractC9334l.yandex(c6956l3, AbstractC2697l.subscription(AbstractC0080l.purchase(c4346l, 72.0f), AbstractC2697l.amazon));
            InterfaceC17242l interfaceC17242lIsPro = AbstractC0080l.isPro(c4346l, 170.0f);
            C10707l c10707l = AbstractC16964l.yandex;
            int i5 = i2;
            AbstractC7741l.amazon(str3, null, AbstractC0019l.crashlytics(interfaceC17242lIsPro, ((C14370l) c6956l3.isPro(c10707l)).crashlytics.crashlytics), null, null, c6956l3, ((i2 >> 3) & 14) | 48, 2040);
            C1853l c1853lYandex2 = AbstractC1001l.yandex(new C7537l(4.0f, true, new C8339l(12)), C18450l.f36046l, c6956l3, 6);
            long j2 = c6956l3.f14595continue;
            int i6 = (int) (j2 ^ (j2 >>> 32));
            InterfaceC18556l interfaceC18556lSmaato2 = c6956l3.smaato();
            InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l3, c4346l);
            c6956l3.m2140super();
            if (c6956l3.f14603switch) {
                c6956l3.firebase(c16395l);
            } else {
                c6956l3.m2136protected();
            }
            AbstractC8182l.billing(c6956l3, c1853lYandex2, c6415l);
            AbstractC8182l.billing(c6956l3, interfaceC18556lSmaato2, c6415l2);
            AbstractC11043l.isPro(i6, c6956l3, c6415l3, c6956l3, c11192l);
            AbstractC8182l.billing(c6956l3, interfaceC17242lBilling2, c6415l4);
            AbstractC13010l.loadAd(str2, AbstractC0080l.amazon(c4346l, 1.0f), ((C14370l) c6956l3.isPro(c10707l)).yandex.adcel, 0L, null, null, null, 0L, new C10258l(3), 0L, 2, false, 1, 0, ((C14370l) c6956l3.isPro(c10707l)).loadAd.mopub, c6956l, ((i5 >> 6) & 14) | 48, 24960, 109560);
            C6956l c6956l4 = c6956l;
            Function2 function4 = c15578l;
            function4.invoke(c6956l4, Integer.valueOf((i5 >> 9) & 14));
            Function2 function5 = c15578l2;
            function5.invoke(c6956l4, Integer.valueOf((i5 >> 12) & 14));
            c6956l4.startapp(true);
            c6956l4.startapp(true);
            function2 = function4;
            function3 = function5;
            c6956l2 = c6956l4;
        } else {
            function2 = c15578l;
            c6956l3.m2124else();
            function3 = c15578l3;
            c6956l2 = c6956l3;
        }
        C4224l c4224lAds = c6956l2.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C5418l(this, str, str2, function2, function3, i, 5);
        }
    }

    /* JADX INFO: renamed from: public, reason: not valid java name */
    public final void m4517public(String str, C6956l c6956l, int i) {
        c6956l.m2133new(650579347);
        int i2 = i | (c6956l.billing(str) ? 4 : 2);
        if (c6956l.m2127for(i2 & 1, (i2 & 3) != 2)) {
            AbstractC13010l.loadAd(str, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l, i2 & 14, 0, 262142);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C3158l(this, str, i, 20);
        }
    }

    /* JADX INFO: renamed from: return, reason: not valid java name */
    public final void m4518return(C10378l c10378l, C6956l c6956l, int i) {
        C6956l c6956l2 = c6956l;
        c6956l2.m2133new(-145642133);
        int i2 = i | (c6956l2.billing(c10378l) ? 4 : 2);
        if (c6956l2.m2127for(i2 & 1, (i2 & 3) != 2)) {
            String str = c10378l.f21173l;
            C4346l c4346l = C4346l.f8873l;
            if (str == null || str.length() == 0) {
                c6956l2.m2123default(-907678562);
                AbstractC13010l.loadAd(c10378l.f21174l, AbstractC0080l.amazon(AbstractC3605l.vip(c4346l, 16.0f, 0.0f, 2), 1.0f), ((C14370l) c6956l2.isPro(AbstractC16964l.yandex)).yandex.subscription, 0L, null, null, null, 0L, new C10258l(3), 0L, 0, false, 0, 0, null, c6956l, 48, 0, 261112);
                c6956l2 = c6956l;
                c6956l2.startapp(false);
            } else {
                c6956l2.m2123default(-907355294);
                C0086l c0086l = C18450l.f36040l;
                InterfaceC17242l interfaceC17242lVip = AbstractC3605l.vip(c4346l, 16.0f, 0.0f, 2);
                C5062l c5062lYandex = AbstractC7001l.yandex(AbstractC8313l.yandex, c0086l, c6956l2, 48);
                long j = c6956l2.f14595continue;
                int i3 = (int) (j ^ (j >>> 32));
                InterfaceC18556l interfaceC18556lSmaato = c6956l2.smaato();
                InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l2, interfaceC17242lVip);
                InterfaceC8801l.firebase.getClass();
                C16395l c16395l = C3438l.loadAd;
                c6956l2.m2140super();
                if (c6956l2.f14603switch) {
                    c6956l2.firebase(c16395l);
                } else {
                    c6956l2.m2136protected();
                }
                AbstractC8182l.billing(c6956l2, c5062lYandex, C3438l.mopub);
                AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato, C3438l.billing);
                AbstractC8182l.billing(c6956l2, Integer.valueOf(i3), C3438l.isPro);
                AbstractC8182l.purchase(c6956l2, C3438l.firebase);
                AbstractC8182l.billing(c6956l2, interfaceC17242lBilling, C3438l.amazon);
                AbstractC7741l.amazon(c10378l.f21173l, null, AbstractC0019l.crashlytics(AbstractC0080l.isPro(c4346l, 64.0f), AbstractC7497l.yandex), null, null, c6956l2, 48, 2040);
                AbstractC13010l.loadAd(c10378l.f21174l, null, ((C14370l) c6956l2.isPro(AbstractC16964l.yandex)).yandex.subscription, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l, 0, 0, 262138);
                c6956l2 = c6956l;
                c6956l2.startapp(true);
                c6956l2.startapp(false);
            }
        } else {
            c6956l2.m2124else();
        }
        C4224l c4224lAds = c6956l2.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C3158l(this, c10378l, i, 22);
        }
    }

    /* JADX INFO: renamed from: this, reason: not valid java name */
    public final void m4519this(C6956l c6956l, int i) {
        c6956l.m2133new(-1749433467);
        int i2 = 4;
        int i3 = i | (c6956l.admob(this) ? 4 : 2);
        if (c6956l.m2127for(i3 & 1, (i3 & 3) != 2)) {
            boolean zAdmob = c6956l.admob(this);
            Object objM2132native = c6956l.m2132native();
            if (zAdmob || objM2132native == C1867l.yandex) {
                objM2132native = new C12478l(this, 7);
                c6956l.m2147try(objM2132native);
            }
            AbstractC16291l.yandex((Function0) objM2132native, AbstractC14566l.amazon(-1091424195, new C12764l(this, i2), c6956l), null, AbstractC14566l.amazon(1478934779, new C12764l(this, 5), c6956l), AbstractC10851l.f21933l, AbstractC10851l.f21922l, AbstractC10851l.f21918l, null, 0L, 0L, 0L, 0L, null, c6956l, 1797168, 0, 16260);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C12764l(this, i, 6);
        }
    }

    /* JADX INFO: renamed from: transient, reason: not valid java name */
    public final void m4520transient(String str, String str2, C15578l c15578l, C15578l c15578l2, C6956l c6956l, int i) {
        C6956l c6956l2 = c6956l;
        c6956l2.m2133new(-692463889);
        int i2 = i | (c6956l2.billing(str) ? 4 : 2) | (c6956l2.billing(str2) ? 32 : 16) | (c6956l2.admob(this) ? 16384 : 8192);
        if (c6956l2.m2127for(i2 & 1, (i2 & 9363) != 9362)) {
            long j = ((C14370l) c6956l2.isPro(AbstractC16964l.yandex)).yandex.startapp;
            C4346l c4346l = C4346l.f8873l;
            InterfaceC17242l interfaceC17242lPurchase = AbstractC10409l.purchase(AbstractC0080l.amazon(c4346l, 1.0f));
            InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(C18450l.f36026l, false);
            long j2 = c6956l2.f14595continue;
            int i3 = (int) (j2 ^ (j2 >>> 32));
            InterfaceC18556l interfaceC18556lSmaato = c6956l2.smaato();
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l2, interfaceC17242lPurchase);
            InterfaceC8801l.firebase.getClass();
            C16395l c16395l = C3438l.loadAd;
            c6956l2.m2140super();
            if (c6956l2.f14603switch) {
                c6956l2.firebase(c16395l);
            } else {
                c6956l2.m2136protected();
            }
            AbstractC8182l.billing(c6956l2, interfaceC10835lAmazon, C3438l.mopub);
            AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato, C3438l.billing);
            AbstractC8182l.billing(c6956l2, Integer.valueOf(i3), C3438l.isPro);
            AbstractC8182l.purchase(c6956l2, C3438l.firebase);
            AbstractC8182l.billing(c6956l2, interfaceC17242lBilling, C3438l.amazon);
            C9477l c9477l = new C9477l((Context) c6956l2.isPro(AbstractC1242l.loadAd));
            c9477l.crashlytics = str;
            c9477l.crashlytics(175);
            AbstractC12872l.crashlytics(c9477l, new C5739l(C14473l.billing));
            C7819l c7819lYandex = c9477l.yandex();
            InterfaceC17242l interfaceC17242lCrashlytics = AbstractC0080l.crashlytics(c4346l, 1.0f);
            boolean zPurchase = c6956l2.purchase(j);
            Object objM2132native = c6956l2.m2132native();
            if (zPurchase || objM2132native == C1867l.yandex) {
                objM2132native = new C4199l(j, 7);
                c6956l2.m2147try(objM2132native);
            }
            AbstractC7741l.amazon(c7819lYandex, null, AbstractC14289l.smaato(interfaceC17242lCrashlytics, (Function1) objM2132native), C4176l.yandex, null, c6956l, 1572912, 1976);
            int i4 = i2 << 3;
            c6956l2 = c6956l;
            m4516protected(str, str2, c15578l, c15578l2, c6956l2, (i4 & 112) | 6 | (i4 & 896) | 27648 | (i4 & 458752));
            c6956l2.startapp(true);
        } else {
            c6956l2.m2124else();
        }
        C4224l c4224lAds = c6956l2.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C0843l(this, str, str2, c15578l, c15578l2, i, 3);
        }
    }

    /* JADX INFO: renamed from: try, reason: not valid java name */
    public final void m4521try(C6956l c6956l, int i) {
        C6956l c6956l2 = c6956l;
        c6956l2.m2133new(-1306047016);
        int i2 = 2;
        int i3 = (c6956l2.admob(this) ? 4 : 2) | i;
        int i4 = 1;
        if (c6956l2.m2127for(i3 & 1, (i3 & 3) != 2)) {
            InterfaceC17242l interfaceC17242lVip = AbstractC3605l.vip(AbstractC3605l.vip(AbstractC4927l.amazon(C4346l.f8873l, AbstractC13106l.purchase(c6956l2).startapp, AbstractC16837l.yandex), 16.0f, 0.0f, 2), 0.0f, 8.0f, 1);
            C5062l c5062lYandex = AbstractC7001l.yandex(new C7537l(16.0f, true, new C8339l(12)), C18450l.f36044l, c6956l2, 6);
            long j = c6956l2.f14595continue;
            int i5 = (int) (j ^ (j >>> 32));
            InterfaceC18556l interfaceC18556lSmaato = c6956l2.smaato();
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l2, interfaceC17242lVip);
            InterfaceC8801l.firebase.getClass();
            C16395l c16395l = C3438l.loadAd;
            c6956l2.m2140super();
            if (c6956l2.f14603switch) {
                c6956l2.firebase(c16395l);
            } else {
                c6956l2.m2136protected();
            }
            AbstractC8182l.billing(c6956l2, c5062lYandex, C3438l.mopub);
            AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato, C3438l.billing);
            AbstractC8182l.billing(c6956l2, Integer.valueOf(i5), C3438l.isPro);
            AbstractC8182l.purchase(c6956l2, C3438l.firebase);
            AbstractC8182l.billing(c6956l2, interfaceC17242lBilling, C3438l.amazon);
            boolean zAdmob = c6956l2.admob(this);
            Object objM2132native = c6956l2.m2132native();
            C13863l c13863l = C1867l.yandex;
            if (zAdmob || objM2132native == c13863l) {
                objM2132native = new C12478l(this, i2);
                c6956l2.m2147try(objM2132native);
            }
            Function0 function0 = (Function0) objM2132native;
            if (1.0f <= 0.0d) {
                AbstractC10440l.yandex("invalid weight; must be greater than zero");
            }
            C9247l c9247l = new C9247l(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            C6839l c6839l = AbstractC13106l.billing(c6956l2).crashlytics;
            C17253l c17253l = C12719l.yandex;
            AbstractC17457l.loadAd(function0, c9247l, false, c6839l, C12719l.yandex(AbstractC13106l.purchase(c6956l2).adcel, AbstractC13106l.purchase(c6956l2).license, 0L, 0L, c6956l2, 12), null, null, AbstractC3605l.loadAd(0.0f, 8.0f, 1), AbstractC10851l.f21927l, c6956l, 817889280, 356);
            boolean zAdmob2 = c6956l.admob(this);
            Object objM2132native2 = c6956l.m2132native();
            if (zAdmob2 || objM2132native2 == c13863l) {
                objM2132native2 = new C12478l(this, 3);
                c6956l.m2147try(objM2132native2);
            }
            Function0 function1 = (Function0) objM2132native2;
            if (1.0f <= 0.0d) {
                AbstractC10440l.yandex("invalid weight; must be greater than zero");
            }
            AbstractC17457l.loadAd(function1, new C9247l(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), false, AbstractC13106l.billing(c6956l).crashlytics, C12719l.yandex(AbstractC13106l.purchase(c6956l).ads, AbstractC13106l.purchase(c6956l).adcel, 0L, 0L, c6956l, 12), null, null, AbstractC3605l.loadAd(0.0f, 8.0f, 1), AbstractC10851l.f21926l, c6956l, 817889280, 356);
            c6956l2 = c6956l;
            c6956l2.startapp(true);
        } else {
            c6956l2.m2124else();
        }
        C4224l c4224lAds = c6956l2.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C12764l(this, i, i4);
        }
    }

    @Override // defpackage.AbstractC15988l, defpackage.AbstractC17777l
    /* JADX INFO: renamed from: volatile */
    public final void mo783volatile(View view) {
        super.mo783volatile(view);
        C18351l c18351lFirebase = AbstractC11990l.firebase(this);
        C16552l c16552l = AbstractC11463l.yandex;
        AbstractC10999l.mopub(c18351lFirebase, ExecutorC6708l.f14063l, 0, new C6658l(this, (InterfaceC14029l) null, 3), 2);
    }
}
