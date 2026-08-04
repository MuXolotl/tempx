package defpackage;

import android.app.Activity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.subs;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ua.itaysonlab.catalogkit.objects.Catalog2Text;
import ua.itaysonlab.catalogkit.objects.seals.Catalog2Layout;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist;
import ua.itaysonlab.vkapi2.objects.users.VKProfile;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.activity.AppActivity;

/* JADX INFO: renamed from: lٗۚۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17398l extends AbstractC3372l {

    /* JADX INFO: renamed from: lؚؑۥ, reason: contains not printable characters */
    public long f33885l;

    /* JADX INFO: renamed from: lؒٓؐ, reason: contains not printable characters */
    public String f33886l;

    /* JADX INFO: renamed from: lٟؓٔ, reason: contains not printable characters */
    public C13260l f33887l;

    /* JADX INFO: renamed from: lؔؕؖ, reason: contains not printable characters */
    public C15051l f33888l;

    /* JADX INFO: renamed from: lؚؕؒ, reason: contains not printable characters */
    public final boolean f33889l;

    /* JADX INFO: renamed from: lؕۗؗ, reason: contains not printable characters */
    public final int f33890l;

    /* JADX INFO: renamed from: lؕۦؓ, reason: contains not printable characters */
    public C11827l f33891l;

    /* JADX INFO: renamed from: lؖ۠ٙ, reason: contains not printable characters */
    public VKProfile f33892l;

    /* JADX INFO: renamed from: lؚؗٞ, reason: contains not printable characters */
    public C8329l f33893l;

    /* JADX INFO: renamed from: lؗٓ٘, reason: contains not printable characters */
    public boolean f33894l;

    /* JADX INFO: renamed from: lؗ۟ۤ, reason: contains not printable characters */
    public C11830l f33895l;

    /* JADX INFO: renamed from: lُؚؓ, reason: contains not printable characters */
    public C7807l f33896l;

    /* JADX INFO: renamed from: lٍَٕ, reason: contains not printable characters */
    public String f33897l;

    /* JADX INFO: renamed from: lِِٞ, reason: contains not printable characters */
    public C4559l f33898l;

    /* JADX INFO: renamed from: lؘْٙ, reason: contains not printable characters */
    public AudioPlaylist f33899l;

    /* JADX INFO: renamed from: lٓٗۢ, reason: contains not printable characters */
    public int f33900l;

    /* JADX INFO: renamed from: lٕۦ۟, reason: contains not printable characters */
    public String f33901l;

    /* JADX INFO: renamed from: lٖ٘ۘ, reason: contains not printable characters */
    public final HashMap f33902l;

    /* JADX INFO: renamed from: l٘ٚؒ, reason: contains not printable characters */
    public int f33903l;

    public C17398l(int i, long j, String str, boolean z) {
        this.f33900l = i;
        this.f33885l = j;
        this.f33901l = str;
        this.f33894l = z;
        this.f33902l = new HashMap();
        this.f33890l = 60;
        this.f33889l = true;
    }

    /* JADX INFO: renamed from: protected, reason: not valid java name */
    public static final void m4321protected(C17398l c17398l, Function1 function1) {
        if (!c17398l.f23160l) {
            function1.invoke(c17398l.m4322implements());
            return;
        }
        C17632l c17632l = C17632l.f34315l;
        Activity activityIsVip = c17398l.isVip();
        AudioPlaylist audioPlaylist = c17398l.f33899l;
        C0786l c0786l = new C0786l(16, function1);
        c17632l.getClass();
        AbstractC9033l.loadAd(c17632l, activityIsVip, false, new C17949l(audioPlaylist, c0786l, null, 10));
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0056, code lost:
    
        if (r15 == r5) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0101, code lost:
    
        if (r15 == r5) goto L56;
     */
    @Override // defpackage.AbstractC3372l
    /* JADX INFO: renamed from: break */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo850break(int r14, defpackage.InterfaceC14029l r15) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 271
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C17398l.mo850break(int, lٌؚٓ):java.lang.Object");
    }

    @Override // defpackage.AbstractC11519l, defpackage.AbstractC2484l
    /* JADX INFO: renamed from: case */
    public final AbstractC14412l mo647case() {
        return new C0878l(this, 36);
    }

    @Override // defpackage.AbstractC2484l
    /* JADX INFO: renamed from: class */
    public final boolean mo1142class() {
        return this.f33889l;
    }

    @Override // defpackage.AbstractC2484l
    /* JADX INFO: renamed from: final */
    public final void mo852final() {
        AbstractC14412l abstractC14412l = this.f5279l;
        if (abstractC14412l == null) {
            abstractC14412l = null;
        }
        C3497l c3497l = (C3497l) abstractC14412l;
        c3497l.smaato(new C4449l(this, 0));
        c3497l.firebase();
    }

    @Override // defpackage.AbstractC11519l
    /* JADX INFO: renamed from: goto */
    public final int mo853goto() {
        return this.f33890l;
    }

    /* JADX INFO: renamed from: implements, reason: not valid java name */
    public final ArrayList m4322implements() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f33902l.values().iterator();
        while (it.hasNext()) {
            arrayList.addAll(((C14451l) it.next()).f28630l.billing);
        }
        return arrayList;
    }

    @Override // defpackage.AbstractC11519l
    /* JADX INFO: renamed from: new */
    public final subs mo1270new() {
        return new C2045l(new C14706l(false, 0), new subs[0]);
    }

    @Override // defpackage.AbstractC17777l
    public final void premium() {
        InterfaceC14029l interfaceC14029l = null;
        C14756l c14756l = new C14756l(this, interfaceC14029l, 0);
        C8490l c8490l = AbstractC6025l.yandex;
        C8084l c8084l = AbstractC6025l.loadAd;
        int i = 2;
        C2347l c2347l = new C2347l(new C14300l(c8084l, 12), new C15556l(c14756l, interfaceC14029l, 6), i);
        C5268l c5268l = this.f34614l;
        EnumC8981l enumC8981l = EnumC8981l.f18524l;
        AbstractC0622l.startapp(AbstractC14024l.startapp(c2347l, c5268l, enumC8981l), AbstractC11738l.yandex(c5268l));
        AbstractC0622l.startapp(AbstractC14024l.startapp(new C2347l(new C14300l(c8084l, 13), new C15556l(new C14756l(this, interfaceC14029l, 1), interfaceC14029l, 8), i), c5268l, enumC8981l), AbstractC11738l.yandex(c5268l));
    }

    @Override // defpackage.AbstractC11519l
    /* JADX INFO: renamed from: super */
    public final void mo1271super() {
        this.f33903l = 0;
        this.f33902l.clear();
    }

    @Override // defpackage.AbstractC3372l
    /* JADX INFO: renamed from: transient */
    public final Object mo1272transient(List list, InterfaceC14029l interfaceC14029l) {
        HashMap map;
        C12732l c12732l = C2782l.f6055l;
        int size = list.size();
        int i = this.f33890l;
        this.f23160l = size == i || list.size() == i - 1;
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AudioTrack audioTrack = (AudioTrack) it.next();
            Integer num = audioTrack.tapsense;
            boolean zContainsKey = map2.containsKey(new Integer(num != null ? num.intValue() : 0));
            Integer num2 = audioTrack.tapsense;
            if (zContainsKey) {
                ((List) map2.get(new Integer(num2 != null ? num2.intValue() : 0))).add(audioTrack);
            } else {
                map2.put(new Integer(num2 != null ? num2.intValue() : 0), AbstractC14055l.metrica(audioTrack));
            }
        }
        Iterator it2 = map2.entrySet().iterator();
        while (true) {
            boolean zHasNext = it2.hasNext();
            map = this.f33902l;
            if (!zHasNext) {
                break;
            }
            Map.Entry entry = (Map.Entry) it2.next();
            if (map.containsKey(entry.getKey())) {
                C14451l c14451l = (C14451l) map.get(entry.getKey());
                C10227l c10227lAdmob = AbstractC14055l.admob();
                c10227lAdmob.addAll(c14451l.f28630l.billing);
                c10227lAdmob.addAll((Collection) entry.getValue());
                c14451l.appmetrica(AbstractC14055l.purchase(c10227lAdmob));
            } else {
                Object key = entry.getKey();
                C14451l c14451l2 = new C14451l(false, false, this.f33899l.smaato(), this.f33891l, new C13932l(10, this), null, 99);
                c14451l2.appmetrica((List) entry.getValue());
                map.put(key, c14451l2);
                map3.put(entry.getKey(), map.get(entry.getKey()));
            }
        }
        if (this.f33903l == 0) {
            Iterator it3 = m1338try().signatures().iterator();
            while (it3.hasNext()) {
                m1338try().premium((subs) it3.next());
            }
            this.f33893l = new C8329l(this);
            this.f33887l = new C13260l(this);
            this.f33895l = new C11830l(this);
            int i2 = 8;
            this.f33898l = new C4559l(i2);
            this.f33896l = new C7807l();
            this.f33888l = new C15051l(this);
            C2045l c2045lM1338try = m1338try();
            c2045lM1338try.isVip(this.f33893l);
            c2045lM1338try.isVip(new C17905l(this.f33895l));
            c2045lM1338try.isVip(this.f33887l);
            AudioPlaylist audioPlaylist = this.f33899l;
            String str = audioPlaylist != null ? audioPlaylist.admob : null;
            if (str != null && str.length() != 0) {
                c2045lM1338try.isVip(this.f33898l);
                this.f33898l.appmetrica(Collections.singletonList(new Catalog2Text("_synth_playlist", 0, this.f33899l.admob)));
            }
            AudioPlaylist audioPlaylist2 = this.f33899l;
            if ((audioPlaylist2 != null ? audioPlaylist2.inmobi : null) != null) {
                C4559l c4559l = new C4559l(i2);
                c4559l.appmetrica(Collections.singletonList(new Catalog2Text("_synth_playlist_block", 0, "Данный альбом временно недоступен или заблокирован.\n\nСкорее всего, правообладатель или артист изъяли его из библиотеки сервиса VK.\n\nУчтите, что VK X никак не относится к данной ошибке и никак не может повлиять, в отличии от блокировки треков по региону.")));
                c2045lM1338try.isVip(c4559l);
            }
            for (Map.Entry entry2 : map.entrySet()) {
                if (((Number) entry2.getKey()).intValue() != 0) {
                    if (((Number) entry2.getKey()).intValue() > 1) {
                        c2045lM1338try.isVip(new C13793l());
                    }
                    c2045lM1338try.isVip(new C8092l(c12732l, new Catalog2Layout.CompactHeader(isVip().getString(R.string.part, entry2.getKey())), null));
                }
                c2045lM1338try.isVip((subs) entry2.getValue());
            }
            c2045lM1338try.isVip(this.f23160l ? this.f33896l : this.f33888l);
            AbstractC14412l abstractC14412l = this.f5279l;
            if (abstractC14412l == null) {
                abstractC14412l = null;
            }
            abstractC14412l.mopub(this.f33899l.mopub);
        } else {
            if (!this.f23160l) {
                m1338try().premium((subs) AbstractC16901l.m4214continue(m1338try().signatures()));
            }
            for (Map.Entry entry3 : map3.entrySet()) {
                if (((Number) entry3.getKey()).intValue() != 0) {
                    if (((Number) entry3.getKey()).intValue() > 1) {
                        m1338try().isVip(new C13793l());
                    }
                    m1338try().isVip(new C8092l(c12732l, new Catalog2Layout.CompactHeader(isVip().getString(R.string.part, entry3.getKey())), null));
                }
                m1338try().isVip((subs) entry3.getValue());
            }
            if (!this.f23160l) {
                m1338try().isVip(this.f33888l);
            }
        }
        if (this.f33894l) {
            this.f33894l = false;
            C11827l c11827l = this.f33891l;
            if (c11827l != null) {
                AbstractC9092l.crashlytics((AppActivity) isVip(), c11827l, new C13305l(null, 0L, null, true, true, false, 103));
            }
        }
        this.f33903l = list.size() + this.f33903l;
        if (m4322implements().size() != this.f33899l.subs) {
            this.f23160l = true;
        }
        C7206l c7206l = C7206l.yandex;
        AbstractC14412l abstractC14412l2 = this.f5279l;
        if (abstractC14412l2 == null) {
            abstractC14412l2 = null;
        }
        AppCompatImageView appCompatImageView = ((C3497l) abstractC14412l2).subs;
        c7206l.yandex(appCompatImageView != null ? appCompatImageView : null, EnumC10788l.f21807l);
        return Unit.INSTANCE;
    }

    public /* synthetic */ C17398l(int i, int i2, long j, String str) {
        this(i, j, (i2 & 4) != 0 ? null : str, false);
    }

    public C17398l(AudioPlaylist audioPlaylist) {
        this(audioPlaylist.crashlytics, 8, audioPlaylist.amazon, audioPlaylist.pro);
    }
}
