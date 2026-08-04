package defpackage;

import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.NativePointer;
import io.realm.kotlin.internal.interop.realmcJNI;
import kotlin.Unit;

/* JADX INFO: renamed from: lؘؚۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6139l extends AbstractC17054l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final C5481l f12921l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final C12418l f12922l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final C11561l f12923l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final C2494l f12924l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final C5198l f12925l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public final C10483l f12926l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final C8688l f12927l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final C5481l f12928l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public boolean f12929l;

    public AbstractC6139l(C5198l c5198l, C12125l c12125l, C2494l c2494l) {
        super(c12125l);
        this.f12925l = c5198l;
        this.f12924l = c2494l;
        this.f12922l = new C12418l(this, (C11534l) c5198l.f33214l);
        this.f12927l = new C8688l(new C9810l(c12125l, this, 7));
        this.f12923l = AbstractC1805l.crashlytics(remoteconfig().yandex(c5198l));
        this.f12929l = true;
        this.f12926l = new C10483l();
        C5653l c5653l = new C5653l(this);
        NativePointer nativePointer = remoteconfig().f12835l;
        int i = 0;
        int i2 = 0;
        C5735l c5735l = new C5735l(0, c5653l, C5653l.class, "onRealmChanged", "onRealmChanged()V", i2, i, 2);
        long ptr$cinterop_release = ((LongPointerWrapper) nativePointer).getPtr$cinterop_release();
        int i3 = AbstractC9795l.yandex;
        this.f12928l = new C5481l(new LongPointerWrapper(realmcJNI.realm_add_realm_changed_callback(ptr$cinterop_release, c5735l), false));
        NativePointer nativePointer2 = remoteconfig().f12835l;
        this.f12921l = new C5481l(new LongPointerWrapper(realmcJNI.realm_add_schema_changed_callback(((LongPointerWrapper) nativePointer2).getPtr$cinterop_release(), new C15406l(1, c5653l, C5653l.class, "onSchemaChanged", "onSchemaChanged(Lio/realm/kotlin/internal/interop/NativePointer;)V", i2, i, 5)), false));
    }

    /* JADX INFO: renamed from: lؒۨٓ, reason: contains not printable characters */
    public final void m1955l() {
        C6067l c6067lRemoteconfig = remoteconfig();
        c6067lRemoteconfig.getClass();
        AbstractC4338l.loadAd(c6067lRemoteconfig);
        C5765l c5765l = (C5765l) this.f12923l.yandex;
        C11534l c11534l = (C11534l) this.f33214l;
        c5765l.getClass();
        c11534l.crashlytics(this + " CLOSE-ACTIVE " + AbstractC4338l.vip(c5765l), new Object[0]);
        AbstractC4338l.loadAd(c5765l);
        this.f12922l.remoteconfig();
        this.f12928l.cancel();
        this.f12921l.cancel();
        ((C11534l) this.f33214l).yandex("Realm closed: " + this, new Object[0]);
    }

    @Override // defpackage.AbstractC17054l, defpackage.InterfaceC13079l
    /* JADX INFO: renamed from: lَؙ۠, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C6067l remoteconfig() {
        return (C6067l) this.f12927l.getValue();
    }

    /* JADX INFO: renamed from: lؚۥۚ, reason: contains not printable characters */
    public final void m1957l() {
        synchronized (this.f12926l) {
            try {
                C5765l c5765l = (C5765l) this.f12923l.yandex;
                c5765l.getClass();
                C10821l c10821lVip = AbstractC4338l.vip(c5765l);
                C6067l c6067lRemoteconfig = remoteconfig();
                c6067lRemoteconfig.getClass();
                if (!AbstractC4338l.mopub(c6067lRemoteconfig)) {
                    C6067l c6067lRemoteconfig2 = remoteconfig();
                    c6067lRemoteconfig2.getClass();
                    if (!c10821lVip.equals(AbstractC4338l.vip(c6067lRemoteconfig2))) {
                        if (this.f12929l) {
                            ((C11534l) this.f33214l).crashlytics(this + " CLOSE-UNTRACKED " + c10821lVip, new Object[0]);
                            C5765l c5765l2 = (C5765l) this.f12923l.yandex;
                            c5765l2.getClass();
                            AbstractC4338l.loadAd(c5765l2);
                        } else {
                            this.f12922l.isVip((C5765l) this.f12923l.yandex);
                        }
                        this.f12923l.yandex = remoteconfig().yandex(this.f12925l);
                        C11534l c11534l = (C11534l) this.f33214l;
                        C5765l c5765l3 = (C5765l) this.f12923l.yandex;
                        c5765l3.getClass();
                        c11534l.crashlytics(this + " ADVANCING " + c10821lVip + " -> " + AbstractC4338l.vip(c5765l3), new Object[0]);
                        this.f12929l = true;
                        Unit unit = Unit.INSTANCE;
                        this.f12922l.vip();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: lًٍّ */
    public void mo1103l() {
        m1957l();
    }

    /* JADX INFO: renamed from: lًَۙ, reason: contains not printable characters */
    public final C5765l m1958l() {
        C5765l c5765l;
        synchronized (this.f12926l) {
            try {
                Object obj = this.f12923l.yandex;
                C5765l c5765l2 = (C5765l) obj;
                if (this.f12929l) {
                    c5765l2.getClass();
                    if (!AbstractC4338l.mopub(c5765l2)) {
                        ((C11534l) this.f33214l).crashlytics(this + " ENABLE-TRACKING " + AbstractC4338l.vip(c5765l2), new Object[0]);
                        this.f12929l = false;
                    }
                }
                c5765l = (C5765l) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c5765l;
    }
}
