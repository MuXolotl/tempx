package defpackage;

/* JADX INFO: renamed from: lٍۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC18512l extends Cgoto {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public boolean f36144l;

    public AbstractC18512l(C17417l c17417l) {
        super(c17417l);
        ((C17417l) this.f833l).f33925l++;
    }

    /* JADX INFO: renamed from: lَؙ۠, reason: contains not printable characters */
    public final void m4563l() {
        if (this.f36144l) {
            C8339l.smaato("Can't initialize twice");
        } else {
            if (mo699l()) {
                return;
            }
            ((C17417l) this.f833l).f33946l.incrementAndGet();
            this.f36144l = true;
        }
    }

    /* JADX INFO: renamed from: lًٔۘ, reason: contains not printable characters */
    public final void m4564l() {
        if (this.f36144l) {
            return;
        }
        C8339l.smaato("Not initialized");
    }

    /* JADX INFO: renamed from: lٕؖؔ */
    public abstract boolean mo699l();
}
